lexer grammar Capicode;



PALAVRA_CHAVE: 'VARIAVEIS'| 'ALGORITMO'| 'NUMERAL' | 'INT'| 'REAL'| 'GUARDA'| 'LER'|
    'MOSTRAR'| 'NAMORAL'| 'NAMORALMEMO'| 'NAOROLOU'| 'ENTAO'|
    'SEGUROO'| 'COMECO'| 'ACABOU'| 'PARO'| 'PULA'| 'PASSA'| 'QUE';
    
NUMINT: ('+'|'-')?('0'..'9')+;

NUMREAL: ('+'|'-')?('0'..'9')+ '.' ('0'..'9')+;

NUMNUMERICO: (NUMINT|NUMREAL)+;

VARIAVEL: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA: '\'' (ESC_SEQ | ~('\'' | '\\') )* '\'';

fragment
ESC_SEQ: '\\\'';

OP_REL: '<' | '>' | '<=' | '>=' | 'E' | 'OU' | '!=' | '==';

OP_ARIT: '+' | '-' | '*' | '/';

DELIM: ':'+;

ABREPAR: '('+;

FECHAPAR: ')'+;

COMENTARIO: '%'~('\n')* '\n' -> skip;

WS: (' ' | '\t' | '\r' | '\n')* -> skip;