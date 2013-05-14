// Generated from /home/gautam/personal/projects/TL4/src/main/java/tl4/grammar/TL4.g4 by ANTLR 4.0

package tl4.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TL4Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Println=1, Print=2, Assert=3, Size=4, Def=5, If=6, Else=7, Return=8, For=9, 
		While=10, To=11, Do=12, End=13, In=14, Null=15, Or=16, And=17, Equals=18, 
		NEquals=19, GTEquals=20, LTEquals=21, Pow=22, Excl=23, GT=24, LT=25, Add=26, 
		Subtract=27, Multiply=28, Divide=29, Modulus=30, OBrace=31, CBrace=32, 
		OBracket=33, CBracket=34, OParen=35, CParen=36, SColon=37, Assign=38, 
		Comma=39, QMark=40, Colon=41, Bool=42, Number=43, Identifier=44, HexChar=45, 
		Space=46, LineComment=47, Comment=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'println'", "'print'", "'assert'", "'size'", "'def'", "'if'", "'else'", 
		"'return'", "'for'", "'while'", "'to'", "'do'", "'end'", "'in'", "'null'", 
		"'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "';'", "'='", "','", "'?'", "':'", "Bool", "Number", "Identifier", 
		"HexChar", "Space", "LineComment", "Comment"
	};
	public static final String[] ruleNames = {
		"Println", "Print", "Assert", "Size", "Def", "If", "Else", "Return", "For", 
		"While", "To", "Do", "End", "In", "Null", "Or", "And", "Equals", "NEquals", 
		"GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
		"Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", 
		"OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", 
		"Number", "Identifier", "HexChar", "Space", "Digit", "Int", "HexDigit", 
		"LineComment", "Comment"
	};


	public TL4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TL4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45: Space_action((RuleContext)_localctx, actionIndex); break;

		case 49: LineComment_action((RuleContext)_localctx, actionIndex); break;

		case 50: Comment_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LineComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void Space_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\62\u013b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u00f6\n+\3,\3"+
		",\3,\7,\u00fb\n,\f,\16,\u00fe\13,\5,\u0100\n,\3-\3-\3-\7-\u0105\n-\f-"+
		"\16-\u0108\13-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\7"+
		"\61\u0119\n\61\f\61\16\61\u011c\13\61\3\61\5\61\u011f\n\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\7\63\u0127\n\63\f\63\16\63\u012a\13\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\7\64\u0132\n\64\f\64\16\64\u0135\13\64\3\64\3\64\3"+
		"\64\3\64\3\64\2\65\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1"+
		"\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24"+
		"\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36"+
		"\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1"+
		"[/\1]\60\2_\2\1a\2\1c\2\1e\61\3g\62\4\3\2\7\5C\\aac|\5C\\aac|\5\13\f\16"+
		"\17\"\"\5\62;CHch\4\f\f\17\17\u0140\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5q\3\2\2\2\7w\3\2"+
		"\2\2\t~\3\2\2\2\13\u0083\3\2\2\2\r\u0087\3\2\2\2\17\u008a\3\2\2\2\21\u008f"+
		"\3\2\2\2\23\u0096\3\2\2\2\25\u009a\3\2\2\2\27\u00a0\3\2\2\2\31\u00a3\3"+
		"\2\2\2\33\u00a6\3\2\2\2\35\u00aa\3\2\2\2\37\u00ad\3\2\2\2!\u00b2\3\2\2"+
		"\2#\u00b5\3\2\2\2%\u00b8\3\2\2\2\'\u00bb\3\2\2\2)\u00be\3\2\2\2+\u00c1"+
		"\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G"+
		"\u00de\3\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2\2\2M\u00e4\3\2\2\2O\u00e6\3\2"+
		"\2\2Q\u00e8\3\2\2\2S\u00ea\3\2\2\2U\u00f5\3\2\2\2W\u00f7\3\2\2\2Y\u0101"+
		"\3\2\2\2[\u0109\3\2\2\2]\u0110\3\2\2\2_\u0114\3\2\2\2a\u011e\3\2\2\2c"+
		"\u0120\3\2\2\2e\u0122\3\2\2\2g\u012d\3\2\2\2ij\7r\2\2jk\7t\2\2kl\7k\2"+
		"\2lm\7p\2\2mn\7v\2\2no\7n\2\2op\7p\2\2p\4\3\2\2\2qr\7r\2\2rs\7t\2\2st"+
		"\7k\2\2tu\7p\2\2uv\7v\2\2v\6\3\2\2\2wx\7c\2\2xy\7u\2\2yz\7u\2\2z{\7g\2"+
		"\2{|\7t\2\2|}\7v\2\2}\b\3\2\2\2~\177\7u\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7|\2\2\u0081\u0082\7g\2\2\u0082\n\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7h\2\2\u0086\f\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7h\2\2\u0089\16\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7g\2\2\u008e\20\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7v\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7p\2\2\u0095\22\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7t\2\2\u0099\24\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c\7j\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7q\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\36\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7~\2\2\u00b3\u00b4\7~\2\2\u00b4"+
		"\"\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7(\2\2\u00b7$\3\2\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\u00ba\7?\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc"+
		"\u00bd\7?\2\2\u00bd(\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"*\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3,\3\2\2\2\u00c4\u00c5"+
		"\7`\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\60\3\2\2\2\u00c8\u00c9"+
		"\7@\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\64\3\2\2\2\u00cc\u00cd"+
		"\7-\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf8\3\2\2\2\u00d0\u00d1"+
		"\7,\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3<\3\2\2\2\u00d4\u00d5"+
		"\7\'\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7@\3\2\2\2\u00d8\u00d9"+
		"\7\177\2\2\u00d9B\3\2\2\2\u00da\u00db\7]\2\2\u00dbD\3\2\2\2\u00dc\u00dd"+
		"\7_\2\2\u00ddF\3\2\2\2\u00de\u00df\7*\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7"+
		"+\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7=\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7?"+
		"\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7P\3\2\2\2\u00e8\u00e9\7A\2"+
		"\2\u00e9R\3\2\2\2\u00ea\u00eb\7<\2\2\u00ebT\3\2\2\2\u00ec\u00ed\7v\2\2"+
		"\u00ed\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f6\7g\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\u00f6\7g\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6V\3\2\2\2\u00f7"+
		"\u00ff\5a\61\2\u00f8\u00fc\7\60\2\2\u00f9\u00fb\5_\60\2\u00fa\u00f9\3"+
		"\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100X\3\2\2\2\u0101\u0106\t\2\2\2\u0102\u0105\t\3\2\2\u0103\u0105"+
		"\5_\60\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107Z\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010a\7^\2\2\u010a\u010b\7w\2\2\u010b\u010c\5c\62\2\u010c\u010d"+
		"\5c\62\2\u010d\u010e\5c\62\2\u010e\u010f\5c\62\2\u010f\\\3\2\2\2\u0110"+
		"\u0111\t\4\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b/\2\2\u0113^\3\2\2\2\u0114"+
		"\u0115\4\62;\2\u0115`\3\2\2\2\u0116\u011a\4\63;\2\u0117\u0119\5_\60\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011f\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\62\2\2"+
		"\u011e\u0116\3\2\2\2\u011e\u011d\3\2\2\2\u011fb\3\2\2\2\u0120\u0121\t"+
		"\5\2\2\u0121d\3\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7\61\2\2\u0124"+
		"\u0128\3\2\2\2\u0125\u0127\n\6\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\b\63\3\2\u012cf\3\2\2\2\u012d\u012e\7\61\2"+
		"\2\u012e\u012f\7,\2\2\u012f\u0133\3\2\2\2\u0130\u0132\13\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7,\2\2\u0137\u0138\7\61"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\64\4\2\u013ah\3\2\2\2\f\2\u00f5"+
		"\u00fc\u00ff\u0104\u0106\u011a\u011e\u0128\u0133";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}