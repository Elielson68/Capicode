// Generated from com\mycompany\capivaracode\Capicode.g4 by ANTLR 4.9.2
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
public class Capicode extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, NUMNUMERICO=4, VARIAVEL=5, CADEIA=6, 
		OP_REL=7, OP_ARIT=8, DELIM=9, ABREPAR=10, FECHAPAR=11, COMENTARIO=12, 
		WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "NUMNUMERICO", "VARIAVEL", "CADEIA", 
			"ESC_SEQ", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "COMENTARIO", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "NUMNUMERICO", "VARIAVEL", 
			"CADEIA", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "COMENTARIO", 
			"WS"
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


	public Capicode(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\u0092\n\2\3\3\5\3\u0095\n\3\3\3\6\3\u0098\n\3\r\3\16\3"+
		"\u0099\3\4\5\4\u009d\n\4\3\4\6\4\u00a0\n\4\r\4\16\4\u00a1\3\4\3\4\6\4"+
		"\u00a6\n\4\r\4\16\4\u00a7\3\5\3\5\6\5\u00ac\n\5\r\5\16\5\u00ad\3\6\3\6"+
		"\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\7\3\7\3\7\7\7\u00ba\n\7\f\7\16\7"+
		"\u00bd\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00d0\n\t\3\n\3\n\3\13\6\13\u00d5\n\13\r\13\16\13\u00d6"+
		"\3\f\6\f\u00da\n\f\r\f\16\f\u00db\3\r\6\r\u00df\n\r\r\r\16\r\u00e0\3\16"+
		"\3\16\7\16\u00e5\n\16\f\16\16\16\u00e8\13\16\3\16\3\16\3\16\3\16\3\17"+
		"\7\17\u00ef\n\17\f\17\16\17\u00f2\13\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\2\21\t\23\n\25\13\27\f\31\r\33\16\35\17\3\2\n\4\2--//\4"+
		"\2C\\c|\5\2\62;C\\c|\4\2))^^\4\2>>@@\5\2,-//\61\61\3\2\f\f\5\2\13\f\17"+
		"\17\"\"\2\u011a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\u0091\3\2\2\2\5\u0094\3\2\2"+
		"\2\7\u009c\3\2\2\2\t\u00ab\3\2\2\2\13\u00af\3\2\2\2\r\u00b6\3\2\2\2\17"+
		"\u00c0\3\2\2\2\21\u00cf\3\2\2\2\23\u00d1\3\2\2\2\25\u00d4\3\2\2\2\27\u00d9"+
		"\3\2\2\2\31\u00de\3\2\2\2\33\u00e2\3\2\2\2\35\u00f0\3\2\2\2\37 \7X\2\2"+
		" !\7C\2\2!\"\7T\2\2\"#\7K\2\2#$\7C\2\2$%\7X\2\2%&\7G\2\2&\'\7K\2\2\'\u0092"+
		"\7U\2\2()\7C\2\2)*\7N\2\2*+\7I\2\2+,\7Q\2\2,-\7T\2\2-.\7K\2\2./\7V\2\2"+
		"/\60\7O\2\2\60\u0092\7Q\2\2\61\62\7P\2\2\62\63\7W\2\2\63\64\7O\2\2\64"+
		"\65\7G\2\2\65\66\7T\2\2\66\67\7C\2\2\67\u0092\7N\2\289\7K\2\29:\7P\2\2"+
		":\u0092\7V\2\2;<\7T\2\2<=\7G\2\2=>\7C\2\2>\u0092\7N\2\2?@\7I\2\2@A\7W"+
		"\2\2AB\7C\2\2BC\7T\2\2CD\7F\2\2D\u0092\7C\2\2EF\7N\2\2FG\7G\2\2G\u0092"+
		"\7T\2\2HI\7O\2\2IJ\7Q\2\2JK\7U\2\2KL\7V\2\2LM\7T\2\2MN\7C\2\2N\u0092\7"+
		"T\2\2OP\7P\2\2PQ\7C\2\2QR\7O\2\2RS\7Q\2\2ST\7T\2\2TU\7C\2\2U\u0092\7N"+
		"\2\2VW\7P\2\2WX\7C\2\2XY\7O\2\2YZ\7Q\2\2Z[\7T\2\2[\\\7C\2\2\\]\7N\2\2"+
		"]^\7O\2\2^_\7G\2\2_`\7O\2\2`\u0092\7Q\2\2ab\7P\2\2bc\7C\2\2cd\7Q\2\2d"+
		"e\7T\2\2ef\7Q\2\2fg\7N\2\2gh\7Q\2\2h\u0092\7W\2\2ij\7G\2\2jk\7P\2\2kl"+
		"\7V\2\2lm\7C\2\2m\u0092\7Q\2\2no\7U\2\2op\7G\2\2pq\7I\2\2qr\7W\2\2rs\7"+
		"T\2\2st\7Q\2\2t\u0092\7Q\2\2uv\7E\2\2vw\7Q\2\2wx\7O\2\2xy\7G\2\2yz\7E"+
		"\2\2z\u0092\7Q\2\2{|\7C\2\2|}\7E\2\2}~\7C\2\2~\177\7D\2\2\177\u0080\7"+
		"Q\2\2\u0080\u0092\7W\2\2\u0081\u0082\7R\2\2\u0082\u0083\7C\2\2\u0083\u0084"+
		"\7T\2\2\u0084\u0092\7Q\2\2\u0085\u0086\7R\2\2\u0086\u0087\7W\2\2\u0087"+
		"\u0088\7N\2\2\u0088\u0092\7C\2\2\u0089\u008a\7R\2\2\u008a\u008b\7C\2\2"+
		"\u008b\u008c\7U\2\2\u008c\u008d\7U\2\2\u008d\u0092\7C\2\2\u008e\u008f"+
		"\7S\2\2\u008f\u0090\7W\2\2\u0090\u0092\7G\2\2\u0091\37\3\2\2\2\u0091("+
		"\3\2\2\2\u0091\61\3\2\2\2\u00918\3\2\2\2\u0091;\3\2\2\2\u0091?\3\2\2\2"+
		"\u0091E\3\2\2\2\u0091H\3\2\2\2\u0091O\3\2\2\2\u0091V\3\2\2\2\u0091a\3"+
		"\2\2\2\u0091i\3\2\2\2\u0091n\3\2\2\2\u0091u\3\2\2\2\u0091{\3\2\2\2\u0091"+
		"\u0081\3\2\2\2\u0091\u0085\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008e\3\2"+
		"\2\2\u0092\4\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\4\62;\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\6\3\2\2\2"+
		"\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u00a0\4\62;\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7\60"+
		"\2\2\u00a4\u00a6\4\62;\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\b\3\2\2\2\u00a9\u00ac\5\5\3\2"+
		"\u00aa\u00ac\5\7\4\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\n\3\2\2\2\u00af"+
		"\u00b3\t\3\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\f\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00bb\7)\2\2\u00b7\u00ba\5\17\b\2\u00b8\u00ba\n\5\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7)\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\7^\2\2\u00c1\u00c2\7)\2\2\u00c2"+
		"\20\3\2\2\2\u00c3\u00d0\t\6\2\2\u00c4\u00c5\7>\2\2\u00c5\u00d0\7?\2\2"+
		"\u00c6\u00c7\7@\2\2\u00c7\u00d0\7?\2\2\u00c8\u00d0\7G\2\2\u00c9\u00ca"+
		"\7Q\2\2\u00ca\u00d0\7W\2\2\u00cb\u00cc\7#\2\2\u00cc\u00d0\7?\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\u00d0\7?\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4\3\2\2"+
		"\2\u00cf\u00c6\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\t\7\2\2\u00d2"+
		"\24\3\2\2\2\u00d3\u00d5\7<\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\26\3\2\2\2\u00d8\u00da"+
		"\7*\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\30\3\2\2\2\u00dd\u00df\7+\2\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\32"+
		"\3\2\2\2\u00e2\u00e6\7\'\2\2\u00e3\u00e5\n\b\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\b\16\2\2\u00ec\34\3\2\2\2\u00ed\u00ef\t\t\2\2\u00ee\u00ed\3\2\2"+
		"\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\17\2\2\u00f4\36\3\2\2\2\24"+
		"\2\u0091\u0094\u0099\u009c\u00a1\u00a7\u00ab\u00ad\u00b3\u00b9\u00bb\u00cf"+
		"\u00d6\u00db\u00e0\u00e6\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}