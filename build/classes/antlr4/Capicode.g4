grammar Capicode;



TIPO_VAR 
	:	'INTEIRO' | 'REAL' | 'NUMERAL';

NUMINT: ('+'|'-')?('0'..'9')+;

NUMREAL: ('+'|'-')?('0'..'9')+ '.' ('0'..'9')+;

NUMERAL: (NUMINT|NUMREAL)+;

OP_BOOL	
	:	'E' | 'OU'
	;

VARIAVEL: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA: '\'' (ESC_SEQ | ~('\'' | '\\') )* '\'';

fragment
ESC_SEQ: '\\\'';

OP_REL: '<' | '>' | '<=' | '>=' | 'E' | 'OU' | '!=' | '==';

OP_ARIT1: '+' | '-';

OP_ARIT2: '*' | '/';

ABREPAR: '('+;

FECHAPAR: ')'+;

COMENTARIO: '%'~('\n')* '\n' -> skip;

WS: (' ' | '\t' | '\r' | '\n')* -> skip;

programa:	
                { System.out.println("Inicio Programa"); }
                ':' 'VARIAVEIS' 
                { System.out.println("\t\nVariáveis: "); }
                listaVariaveis ':' 'ALGORITMO'
                { System.out.println("\t\nAlgoritmo: "); }
                listaComandos 
	;
	
listaVariaveis
	:	declaracao listaVariaveis | declaracao
	;
	
declaracao 
	:	VARIAVEL ':' TIPO_VAR
                { System.out.println("\t\t\nDeclaração: Var="+$VARIAVEL.text+", Tipo="+$TIPO_VAR.text); }
	;
	
expressaoAritmetica
	:	expressaoAritmetica OP_ARIT1 termoAritmetico
	|	termoAritmetico
	;
	
termoAritmetico
	:	termoAritmetico OP_ARIT2 fatorAritmetico
	|	fatorAritmetico
	;
	
fatorAritmetico
	:	NUMINT
	|	NUMREAL
	|	VARIAVEL
	|	'(' expressaoAritmetica ')'
	;
	
expressaoRelacional
	:	expressaoRelacional OP_BOOL termoRelacional
	|	termoRelacional
	;
	
termoRelacional
	:	expressaoAritmetica OP_REL expressaoAritmetica
	|	'(' expressaoRelacional ')'
	;
	

listaComandos
	:	comando listaComandos
	|	comando
                { System.out.println("Apareceu o comando: "+$comando.tipo_comando); }
	;
	
comando returns [ String tipo_comando ]
	:	comandoAtribuicao { $tipo_comando = "\t\t\nAtribuição"; }
	|	comandoEntrada { $tipo_comando = "\t\t\nEntrada"; }
	|	comandoSaida { $tipo_comando = "\t\t\nSaída"; }
	|	comandoCondicao { $tipo_comando = "\t\t\nCondição"; }
	|	comandoRepeticao { $tipo_comando = "\t\t\nRepetição"; }
	|	subAlgoritmo { $tipo_comando = "\t\t\nComando = SubAlgoritmo"; }
	;
	
comandoAtribuicao
	:	VARIAVEL 'GUARDA' expressaoAritmetica
                { System.out.println("\t\t\n"+$VARIAVEL.text+" = "+$expressaoAritmetica.text); }
	;
	
comandoEntrada
	:	'LER' VARIAVEL
                { System.out.println("\t\t\n"+$VARIAVEL.text+" = ENTRADA"); }
	;
comandoSaida
	:	'MOSTRAR' (VARIAVEL | CADEIA)
	;
	
comandoCondicao
	:	'NAMORAL QUE' expressaoRelacional 'ENTAO' comando
	|	'NAMORAL QUE' expressaoRelacional 'ENTAO' comando 'NAOROLOU' comando
	;
	
comandoRepeticao
	:	'SEGUROO' expressaoRelacional comando
	;
subAlgoritmo
	: 'COMECO' listaComandos 'ACABOU'
	;