// Generated from com\mycompany\capicodesintatico\Capicode.g4 by ANTLR 4.9.2
package com.mycompany.capivaracode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CapicodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TIPO_VAR=15, NUMINT=16, 
		NUMREAL=17, NUMERAL=18, OP_BOOL=19, VARIAVEL=20, CADEIA=21, OP_REL=22, 
		OP_ARIT1=23, OP_ARIT2=24, ABREPAR=25, FECHAPAR=26, COMENTARIO=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "TIPO_VAR", "NUMINT", "NUMREAL", 
			"NUMERAL", "OP_BOOL", "VARIAVEL", "CADEIA", "ESC_SEQ", "OP_REL", "OP_ARIT1", 
			"OP_ARIT2", "ABREPAR", "FECHAPAR", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'VARIAVEIS'", "'ALGORITMO'", "'('", "')'", "'GUARDA'", 
			"'LER'", "'MOSTRAR'", "'NAMORAL QUE'", "'ENTAO'", "'NAOROLOU'", "'SEGUROO'", 
			"'COMECO'", "'ACABOU'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", "NUMERAL", "OP_BOOL", 
			"VARIAVEL", "CADEIA", "OP_REL", "OP_ARIT1", "OP_ARIT2", "ABREPAR", "FECHAPAR", 
			"COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CapicodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Capicode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0113\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ae\n\20"+
		"\3\21\5\21\u00b1\n\21\3\21\6\21\u00b4\n\21\r\21\16\21\u00b5\3\22\5\22"+
		"\u00b9\n\22\3\22\6\22\u00bc\n\22\r\22\16\22\u00bd\3\22\3\22\6\22\u00c2"+
		"\n\22\r\22\16\22\u00c3\3\23\3\23\6\23\u00c8\n\23\r\23\16\23\u00c9\3\24"+
		"\3\24\3\24\5\24\u00cf\n\24\3\25\3\25\7\25\u00d3\n\25\f\25\16\25\u00d6"+
		"\13\25\3\26\3\26\3\26\7\26\u00db\n\26\f\26\16\26\u00de\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00f1\n\30\3\31\3\31\3\32\3\32\3\33\6\33\u00f8\n\33\r\33\16"+
		"\33\u00f9\3\34\6\34\u00fd\n\34\r\34\16\34\u00fe\3\35\3\35\7\35\u0103\n"+
		"\35\f\35\16\35\u0106\13\35\3\35\3\35\3\35\3\35\3\36\7\36\u010d\n\36\f"+
		"\36\16\36\u0110\13\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2"+
		"/\30\61\31\63\32\65\33\67\349\35;\36\3\2\n\4\2--//\4\2C\\c|\5\2\62;C\\"+
		"c|\4\2))^^\4\2>>@@\4\2,,\61\61\3\2\f\f\5\2\13\f\17\17\"\"\2\u0128\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2"+
		"\2\5?\3\2\2\2\7I\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17^\3\2\2\2"+
		"\21b\3\2\2\2\23j\3\2\2\2\25v\3\2\2\2\27|\3\2\2\2\31\u0085\3\2\2\2\33\u008d"+
		"\3\2\2\2\35\u0094\3\2\2\2\37\u00ad\3\2\2\2!\u00b0\3\2\2\2#\u00b8\3\2\2"+
		"\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d0\3\2\2\2+\u00d7\3\2\2\2-\u00e1"+
		"\3\2\2\2/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63\u00f4\3\2\2\2\65\u00f7\3\2"+
		"\2\2\67\u00fc\3\2\2\29\u0100\3\2\2\2;\u010e\3\2\2\2=>\7<\2\2>\4\3\2\2"+
		"\2?@\7X\2\2@A\7C\2\2AB\7T\2\2BC\7K\2\2CD\7C\2\2DE\7X\2\2EF\7G\2\2FG\7"+
		"K\2\2GH\7U\2\2H\6\3\2\2\2IJ\7C\2\2JK\7N\2\2KL\7I\2\2LM\7Q\2\2MN\7T\2\2"+
		"NO\7K\2\2OP\7V\2\2PQ\7O\2\2QR\7Q\2\2R\b\3\2\2\2ST\7*\2\2T\n\3\2\2\2UV"+
		"\7+\2\2V\f\3\2\2\2WX\7I\2\2XY\7W\2\2YZ\7C\2\2Z[\7T\2\2[\\\7F\2\2\\]\7"+
		"C\2\2]\16\3\2\2\2^_\7N\2\2_`\7G\2\2`a\7T\2\2a\20\3\2\2\2bc\7O\2\2cd\7"+
		"Q\2\2de\7U\2\2ef\7V\2\2fg\7T\2\2gh\7C\2\2hi\7T\2\2i\22\3\2\2\2jk\7P\2"+
		"\2kl\7C\2\2lm\7O\2\2mn\7Q\2\2no\7T\2\2op\7C\2\2pq\7N\2\2qr\7\"\2\2rs\7"+
		"S\2\2st\7W\2\2tu\7G\2\2u\24\3\2\2\2vw\7G\2\2wx\7P\2\2xy\7V\2\2yz\7C\2"+
		"\2z{\7Q\2\2{\26\3\2\2\2|}\7P\2\2}~\7C\2\2~\177\7Q\2\2\177\u0080\7T\2\2"+
		"\u0080\u0081\7Q\2\2\u0081\u0082\7N\2\2\u0082\u0083\7Q\2\2\u0083\u0084"+
		"\7W\2\2\u0084\30\3\2\2\2\u0085\u0086\7U\2\2\u0086\u0087\7G\2\2\u0087\u0088"+
		"\7I\2\2\u0088\u0089\7W\2\2\u0089\u008a\7T\2\2\u008a\u008b\7Q\2\2\u008b"+
		"\u008c\7Q\2\2\u008c\32\3\2\2\2\u008d\u008e\7E\2\2\u008e\u008f\7Q\2\2\u008f"+
		"\u0090\7O\2\2\u0090\u0091\7G\2\2\u0091\u0092\7E\2\2\u0092\u0093\7Q\2\2"+
		"\u0093\34\3\2\2\2\u0094\u0095\7C\2\2\u0095\u0096\7E\2\2\u0096\u0097\7"+
		"C\2\2\u0097\u0098\7D\2\2\u0098\u0099\7Q\2\2\u0099\u009a\7W\2\2\u009a\36"+
		"\3\2\2\2\u009b\u009c\7K\2\2\u009c\u009d\7P\2\2\u009d\u009e\7V\2\2\u009e"+
		"\u009f\7G\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7T\2\2\u00a1\u00ae\7Q\2\2"+
		"\u00a2\u00a3\7T\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7C\2\2\u00a5\u00ae"+
		"\7N\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7W\2\2\u00a8\u00a9\7O\2\2\u00a9"+
		"\u00aa\7G\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ae\7N\2\2"+
		"\u00ad\u009b\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae \3"+
		"\2\2\2\u00af\u00b1\t\2\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b4\4\62;\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\"\3\2\2\2\u00b7\u00b9"+
		"\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00bc\4\62;\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\60\2\2\u00c0"+
		"\u00c2\4\62;\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4$\3\2\2\2\u00c5\u00c8\5!\21\2\u00c6\u00c8"+
		"\5#\22\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca&\3\2\2\2\u00cb\u00cf\7G\2\2\u00cc"+
		"\u00cd\7Q\2\2\u00cd\u00cf\7W\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf(\3\2\2\2\u00d0\u00d4\t\3\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"*\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\7)\2\2\u00d8\u00db\5-\27\2\u00d9"+
		"\u00db\n\5\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7)\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2"+
		"\u00e3\7)\2\2\u00e3.\3\2\2\2\u00e4\u00f1\t\6\2\2\u00e5\u00e6\7>\2\2\u00e6"+
		"\u00f1\7?\2\2\u00e7\u00e8\7@\2\2\u00e8\u00f1\7?\2\2\u00e9\u00f1\7G\2\2"+
		"\u00ea\u00eb\7Q\2\2\u00eb\u00f1\7W\2\2\u00ec\u00ed\7#\2\2\u00ed\u00f1"+
		"\7?\2\2\u00ee\u00ef\7?\2\2\u00ef\u00f1\7?\2\2\u00f0\u00e4\3\2\2\2\u00f0"+
		"\u00e5\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ea\3\2"+
		"\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\60\3\2\2\2\u00f2\u00f3"+
		"\t\2\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\t\7\2\2\u00f5\64\3\2\2\2\u00f6\u00f8"+
		"\7*\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\66\3\2\2\2\u00fb\u00fd\7+\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff8\3"+
		"\2\2\2\u0100\u0104\7\'\2\2\u0101\u0103\n\b\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\f\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\b\35\2\2\u010a:\3\2\2\2\u010b\u010d\t\t\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\b\36\2\2\u0112<\3\2\2\2\24\2"+
		"\u00ad\u00b0\u00b5\u00b8\u00bd\u00c3\u00c7\u00c9\u00ce\u00d4\u00da\u00dc"+
		"\u00f0\u00f9\u00fe\u0104\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}