package antlrmathevaluator.antlr4.output;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathEvaluatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, LPAREN=2, RPAREN=3, GT=4, LT=5, RSHIFT=6, LSHIFT=7, ZRSHIFT=8, 
		NOT=9, BINV=10, QUESTION=11, COLON=12, EQUAL=13, LE=14, GE=15, NOTEQUAL=16, 
		AND=17, OR=18, INC=19, DEC=20, ADD=21, SUB=22, MUL=23, DIV=24, BITAND=25, 
		BITOR=26, CARET=27, MOD=28, MAX=29, MIN=30, ABS=31, NEG=32, CEIL=33, FLOOR=34, 
		ROUND=35, ACOS=36, ACOSH=37, ASIN=38, ASINH=39, ATAN=40, ATANH=41, ATAN2=42, 
		COS=43, COSH=44, EXP=45, EXPM1=46, LOG=47, LOG10=48, LOG1P=49, POW=50, 
		SIN=51, SINH=52, SQRT=53, TAN=54, TANH=55, TODEGREES=56, TORADIANS=57, 
		IntegerLiteral=58, FloatingPointLiteral=59, WS=60, COMMENT=61, LINE_COMMENT=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMA", "LPAREN", "RPAREN", "GT", "LT", "RSHIFT", "LSHIFT", "ZRSHIFT", 
		"NOT", "BINV", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "MAX", "MIN", "ABS", "NEG", "CEIL", "FLOOR", "ROUND", "ACOS", "ACOSH", 
		"ASIN", "ASINH", "ATAN", "ATANH", "ATAN2", "COS", "COSH", "EXP", "EXPM1", 
		"LOG", "LOG10", "LOG1P", "POW", "SIN", "SINH", "SQRT", "TAN", "TANH", 
		"TODEGREES", "TORADIANS", "IntegerLiteral", "BooleanIntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", 
		"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "WS", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'", "'>'", "'<'", "'>>'", "'<<'", "'>>>'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'max'", 
		"'min'", "'abs'", "'neg'", "'ceil'", "'floor'", "'round'", "'acos'", "'acosh'", 
		"'asin'", "'asinh'", "'atan'", "'atanh'", "'atan2'", "'cos'", "'cosh'", 
		"'exp'", "'expm1'", "'log'", "'log10'", "'log1p'", "'pow'", "'sin'", "'sinh'", 
		"'sqrt'", "'tan'", "'tanh'", "'toDegrees'", "'toRadians'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "LPAREN", "RPAREN", "GT", "LT", "RSHIFT", "LSHIFT", "ZRSHIFT", 
		"NOT", "BINV", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "MAX", "MIN", "ABS", "NEG", "CEIL", "FLOOR", "ROUND", "ACOS", "ACOSH", 
		"ASIN", "ASINH", "ATAN", "ATANH", "ATAN2", "COS", "COSH", "EXP", "EXPM1", 
		"LOG", "LOG10", "LOG1P", "POW", "SIN", "SINH", "SQRT", "TAN", "TANH", 
		"TODEGREES", "TORADIANS", "IntegerLiteral", "FloatingPointLiteral", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
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


	public static final Map<String, String> tokenNameMap;
	static{
	    tokenNameMap = new HashMap<>();
	    for(int i = 1; i < _LITERAL_NAMES.length; i++){
	        if(VOCABULARY.getLiteralName(i).charAt(1) <= 'z' && VOCABULARY.getLiteralName(i).charAt(1) >= 'a'){
	            tokenNameMap.put(VOCABULARY.getLiteralName(i).toUpperCase().replace("'", ""), VOCABULARY.getLiteralName(i));
	        }
	    }
	}


	public MathEvaluatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathEvaluator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u028e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39"+
		"\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\5;"+
		"\u01a7\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01b2\n<\3=\3=\5=\u01b6\n=\3>"+
		"\3>\5>\u01ba\n>\3?\3?\5?\u01be\n?\3@\3@\5@\u01c2\n@\3A\3A\3B\3B\3B\5B"+
		"\u01c9\nB\3B\3B\3B\5B\u01ce\nB\5B\u01d0\nB\3C\3C\7C\u01d4\nC\fC\16C\u01d7"+
		"\13C\3C\5C\u01da\nC\3D\3D\5D\u01de\nD\3E\3E\3F\3F\5F\u01e4\nF\3G\6G\u01e7"+
		"\nG\rG\16G\u01e8\3H\3H\3H\3H\3I\3I\7I\u01f1\nI\fI\16I\u01f4\13I\3I\5I"+
		"\u01f7\nI\3J\3J\3K\3K\5K\u01fd\nK\3L\3L\5L\u0201\nL\3L\3L\3M\3M\7M\u0207"+
		"\nM\fM\16M\u020a\13M\3M\5M\u020d\nM\3N\3N\3O\3O\5O\u0213\nO\3P\3P\3P\3"+
		"P\3Q\3Q\7Q\u021b\nQ\fQ\16Q\u021e\13Q\3Q\5Q\u0221\nQ\3R\3R\3S\3S\5S\u0227"+
		"\nS\3T\3T\5T\u022b\nT\3U\3U\3U\5U\u0230\nU\3U\5U\u0233\nU\3U\5U\u0236"+
		"\nU\3U\3U\3U\5U\u023b\nU\3U\5U\u023e\nU\3U\3U\3U\5U\u0243\nU\3U\3U\3U"+
		"\5U\u0248\nU\3V\3V\3V\3W\3W\3X\5X\u0250\nX\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3["+
		"\5[\u025b\n[\3\\\3\\\5\\\u025f\n\\\3\\\3\\\3\\\5\\\u0264\n\\\3\\\3\\\5"+
		"\\\u0268\n\\\3]\3]\3]\3^\3^\3_\6_\u0270\n_\r_\16_\u0271\3_\3_\3`\3`\3"+
		"`\3`\7`\u027a\n`\f`\16`\u027d\13`\3`\3`\3`\3`\3`\3a\3a\3a\3a\7a\u0288"+
		"\na\fa\16a\u028b\13a\3a\3a\3\u027b\2b\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{\2}\2\177\2\u0081\2"+
		"\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093"+
		"\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7=\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd>\u00bf?\u00c1@\3\2\17\4\2NNnn\3\2\63;\4\2ZZz"+
		"z\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4"+
		"\2RRrr\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0298\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2\u00a7\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\3\u00c3\3\2\2\2\5\u00c5\3\2\2\2\7\u00c7\3\2\2\2\t\u00c9"+
		"\3\2\2\2\13\u00cb\3\2\2\2\r\u00cd\3\2\2\2\17\u00d0\3\2\2\2\21\u00d3\3"+
		"\2\2\2\23\u00d7\3\2\2\2\25\u00d9\3\2\2\2\27\u00db\3\2\2\2\31\u00dd\3\2"+
		"\2\2\33\u00df\3\2\2\2\35\u00e2\3\2\2\2\37\u00e5\3\2\2\2!\u00e8\3\2\2\2"+
		"#\u00eb\3\2\2\2%\u00ee\3\2\2\2\'\u00f1\3\2\2\2)\u00f4\3\2\2\2+\u00f7\3"+
		"\2\2\2-\u00f9\3\2\2\2/\u00fb\3\2\2\2\61\u00fd\3\2\2\2\63\u00ff\3\2\2\2"+
		"\65\u0101\3\2\2\2\67\u0103\3\2\2\29\u0105\3\2\2\2;\u0107\3\2\2\2=\u010b"+
		"\3\2\2\2?\u010f\3\2\2\2A\u0113\3\2\2\2C\u0117\3\2\2\2E\u011c\3\2\2\2G"+
		"\u0122\3\2\2\2I\u0128\3\2\2\2K\u012d\3\2\2\2M\u0133\3\2\2\2O\u0138\3\2"+
		"\2\2Q\u013e\3\2\2\2S\u0143\3\2\2\2U\u0149\3\2\2\2W\u014f\3\2\2\2Y\u0153"+
		"\3\2\2\2[\u0158\3\2\2\2]\u015c\3\2\2\2_\u0162\3\2\2\2a\u0166\3\2\2\2c"+
		"\u016c\3\2\2\2e\u0172\3\2\2\2g\u0176\3\2\2\2i\u017a\3\2\2\2k\u017f\3\2"+
		"\2\2m\u0184\3\2\2\2o\u0188\3\2\2\2q\u018d\3\2\2\2s\u0197\3\2\2\2u\u01a6"+
		"\3\2\2\2w\u01b1\3\2\2\2y\u01b3\3\2\2\2{\u01b7\3\2\2\2}\u01bb\3\2\2\2\177"+
		"\u01bf\3\2\2\2\u0081\u01c3\3\2\2\2\u0083\u01cf\3\2\2\2\u0085\u01d1\3\2"+
		"\2\2\u0087\u01dd\3\2\2\2\u0089\u01df\3\2\2\2\u008b\u01e3\3\2\2\2\u008d"+
		"\u01e6\3\2\2\2\u008f\u01ea\3\2\2\2\u0091\u01ee\3\2\2\2\u0093\u01f8\3\2"+
		"\2\2\u0095\u01fc\3\2\2\2\u0097\u01fe\3\2\2\2\u0099\u0204\3\2\2\2\u009b"+
		"\u020e\3\2\2\2\u009d\u0212\3\2\2\2\u009f\u0214\3\2\2\2\u00a1\u0218\3\2"+
		"\2\2\u00a3\u0222\3\2\2\2\u00a5\u0226\3\2\2\2\u00a7\u022a\3\2\2\2\u00a9"+
		"\u0247\3\2\2\2\u00ab\u0249\3\2\2\2\u00ad\u024c\3\2\2\2\u00af\u024f\3\2"+
		"\2\2\u00b1\u0253\3\2\2\2\u00b3\u0255\3\2\2\2\u00b5\u0257\3\2\2\2\u00b7"+
		"\u0267\3\2\2\2\u00b9\u0269\3\2\2\2\u00bb\u026c\3\2\2\2\u00bd\u026f\3\2"+
		"\2\2\u00bf\u0275\3\2\2\2\u00c1\u0283\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4"+
		"\4\3\2\2\2\u00c5\u00c6\7*\2\2\u00c6\6\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8"+
		"\b\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\n\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc"+
		"\f\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce\u00cf\7@\2\2\u00cf\16\3\2\2\2\u00d0"+
		"\u00d1\7>\2\2\u00d1\u00d2\7>\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4"+
		"\u00d5\7@\2\2\u00d5\u00d6\7@\2\2\u00d6\22\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8"+
		"\24\3\2\2\2\u00d9\u00da\7\u0080\2\2\u00da\26\3\2\2\2\u00db\u00dc\7A\2"+
		"\2\u00dc\30\3\2\2\2\u00dd\u00de\7<\2\2\u00de\32\3\2\2\2\u00df\u00e0\7"+
		"?\2\2\u00e0\u00e1\7?\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4"+
		"\7?\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\7?\2\2\u00e7 "+
		"\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7?\2\2\u00ea\"\3\2\2\2\u00eb\u00ec"+
		"\7(\2\2\u00ec\u00ed\7(\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f0"+
		"\7~\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7-\2\2\u00f3(\3"+
		"\2\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7/\2\2\u00f6*\3\2\2\2\u00f7\u00f8"+
		"\7-\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7"+
		",\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\62\3\2\2\2\u00ff\u0100"+
		"\7(\2\2\u0100\64\3\2\2\2\u0101\u0102\7~\2\2\u0102\66\3\2\2\2\u0103\u0104"+
		"\7`\2\2\u01048\3\2\2\2\u0105\u0106\7\'\2\2\u0106:\3\2\2\2\u0107\u0108"+
		"\7o\2\2\u0108\u0109\7c\2\2\u0109\u010a\7z\2\2\u010a<\3\2\2\2\u010b\u010c"+
		"\7o\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e>\3\2\2\2\u010f\u0110"+
		"\7c\2\2\u0110\u0111\7d\2\2\u0111\u0112\7u\2\2\u0112@\3\2\2\2\u0113\u0114"+
		"\7p\2\2\u0114\u0115\7g\2\2\u0115\u0116\7i\2\2\u0116B\3\2\2\2\u0117\u0118"+
		"\7e\2\2\u0118\u0119\7g\2\2\u0119\u011a\7k\2\2\u011a\u011b\7n\2\2\u011b"+
		"D\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e\7n\2\2\u011e\u011f\7q\2\2\u011f"+
		"\u0120\7q\2\2\u0120\u0121\7t\2\2\u0121F\3\2\2\2\u0122\u0123\7t\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7w\2\2\u0125\u0126\7p\2\2\u0126\u0127\7f\2\2"+
		"\u0127H\3\2\2\2\u0128\u0129\7c\2\2\u0129\u012a\7e\2\2\u012a\u012b\7q\2"+
		"\2\u012b\u012c\7u\2\2\u012cJ\3\2\2\2\u012d\u012e\7c\2\2\u012e\u012f\7"+
		"e\2\2\u012f\u0130\7q\2\2\u0130\u0131\7u\2\2\u0131\u0132\7j\2\2\u0132L"+
		"\3\2\2\2\u0133\u0134\7c\2\2\u0134\u0135\7u\2\2\u0135\u0136\7k\2\2\u0136"+
		"\u0137\7p\2\2\u0137N\3\2\2\2\u0138\u0139\7c\2\2\u0139\u013a\7u\2\2\u013a"+
		"\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7j\2\2\u013dP\3\2\2\2\u013e"+
		"\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140\u0141\7c\2\2\u0141\u0142\7p\2\2"+
		"\u0142R\3\2\2\2\u0143\u0144\7c\2\2\u0144\u0145\7v\2\2\u0145\u0146\7c\2"+
		"\2\u0146\u0147\7p\2\2\u0147\u0148\7j\2\2\u0148T\3\2\2\2\u0149\u014a\7"+
		"c\2\2\u014a\u014b\7v\2\2\u014b\u014c\7c\2\2\u014c\u014d\7p\2\2\u014d\u014e"+
		"\7\64\2\2\u014eV\3\2\2\2\u014f\u0150\7e\2\2\u0150\u0151\7q\2\2\u0151\u0152"+
		"\7u\2\2\u0152X\3\2\2\2\u0153\u0154\7e\2\2\u0154\u0155\7q\2\2\u0155\u0156"+
		"\7u\2\2\u0156\u0157\7j\2\2\u0157Z\3\2\2\2\u0158\u0159\7g\2\2\u0159\u015a"+
		"\7z\2\2\u015a\u015b\7r\2\2\u015b\\\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7z\2\2\u015e\u015f\7r\2\2\u015f\u0160\7o\2\2\u0160\u0161\7\63\2\2\u0161"+
		"^\3\2\2\2\u0162\u0163\7n\2\2\u0163\u0164\7q\2\2\u0164\u0165\7i\2\2\u0165"+
		"`\3\2\2\2\u0166\u0167\7n\2\2\u0167\u0168\7q\2\2\u0168\u0169\7i\2\2\u0169"+
		"\u016a\7\63\2\2\u016a\u016b\7\62\2\2\u016bb\3\2\2\2\u016c\u016d\7n\2\2"+
		"\u016d\u016e\7q\2\2\u016e\u016f\7i\2\2\u016f\u0170\7\63\2\2\u0170\u0171"+
		"\7r\2\2\u0171d\3\2\2\2\u0172\u0173\7r\2\2\u0173\u0174\7q\2\2\u0174\u0175"+
		"\7y\2\2\u0175f\3\2\2\2\u0176\u0177\7u\2\2\u0177\u0178\7k\2\2\u0178\u0179"+
		"\7p\2\2\u0179h\3\2\2\2\u017a\u017b\7u\2\2\u017b\u017c\7k\2\2\u017c\u017d"+
		"\7p\2\2\u017d\u017e\7j\2\2\u017ej\3\2\2\2\u017f\u0180\7u\2\2\u0180\u0181"+
		"\7s\2\2\u0181\u0182\7t\2\2\u0182\u0183\7v\2\2\u0183l\3\2\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0186\7c\2\2\u0186\u0187\7p\2\2\u0187n\3\2\2\2\u0188\u0189"+
		"\7v\2\2\u0189\u018a\7c\2\2\u018a\u018b\7p\2\2\u018b\u018c\7j\2\2\u018c"+
		"p\3\2\2\2\u018d\u018e\7v\2\2\u018e\u018f\7q\2\2\u018f\u0190\7F\2\2\u0190"+
		"\u0191\7g\2\2\u0191\u0192\7i\2\2\u0192\u0193\7t\2\2\u0193\u0194\7g\2\2"+
		"\u0194\u0195\7g\2\2\u0195\u0196\7u\2\2\u0196r\3\2\2\2\u0197\u0198\7v\2"+
		"\2\u0198\u0199\7q\2\2\u0199\u019a\7T\2\2\u019a\u019b\7c\2\2\u019b\u019c"+
		"\7f\2\2\u019c\u019d\7k\2\2\u019d\u019e\7c\2\2\u019e\u019f\7p\2\2\u019f"+
		"\u01a0\7u\2\2\u01a0t\3\2\2\2\u01a1\u01a7\5y=\2\u01a2\u01a7\5{>\2\u01a3"+
		"\u01a7\5}?\2\u01a4\u01a7\5\177@\2\u01a5\u01a7\5w<\2\u01a6\u01a1\3\2\2"+
		"\2\u01a6\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a7v\3\2\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab"+
		"\7w\2\2\u01ab\u01b2\7g\2\2\u01ac\u01ad\7h\2\2\u01ad\u01ae\7c\2\2\u01ae"+
		"\u01af\7n\2\2\u01af\u01b0\7u\2\2\u01b0\u01b2\7g\2\2\u01b1\u01a8\3\2\2"+
		"\2\u01b1\u01ac\3\2\2\2\u01b2x\3\2\2\2\u01b3\u01b5\5\u0083B\2\u01b4\u01b6"+
		"\5\u0081A\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6z\3\2\2\2\u01b7"+
		"\u01b9\5\u008fH\2\u01b8\u01ba\5\u0081A\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba|\3\2\2\2\u01bb\u01bd\5\u0097L\2\u01bc\u01be\5\u0081A\2"+
		"\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be~\3\2\2\2\u01bf\u01c1\5"+
		"\u009fP\2\u01c0\u01c2\5\u0081A\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u0080\3\2\2\2\u01c3\u01c4\t\2\2\2\u01c4\u0082\3\2\2\2\u01c5\u01d0"+
		"\7\62\2\2\u01c6\u01cd\5\u0089E\2\u01c7\u01c9\5\u0085C\2\u01c8\u01c7\3"+
		"\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca\u01cb\5\u008dG\2"+
		"\u01cb\u01cc\5\u0085C\2\u01cc\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd"+
		"\u01ca\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01c6\3\2"+
		"\2\2\u01d0\u0084\3\2\2\2\u01d1\u01d9\5\u0087D\2\u01d2\u01d4\5\u008bF\2"+
		"\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01da\5\u0087D"+
		"\2\u01d9\u01d5\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u0086\3\2\2\2\u01db\u01de"+
		"\7\62\2\2\u01dc\u01de\5\u0089E\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2"+
		"\2\u01de\u0088\3\2\2\2\u01df\u01e0\t\3\2\2\u01e0\u008a\3\2\2\2\u01e1\u01e4"+
		"\5\u0087D\2\u01e2\u01e4\7a\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2"+
		"\u01e4\u008c\3\2\2\2\u01e5\u01e7\7a\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u008e\3\2\2\2\u01ea"+
		"\u01eb\7\62\2\2\u01eb\u01ec\t\4\2\2\u01ec\u01ed\5\u0091I\2\u01ed\u0090"+
		"\3\2\2\2\u01ee\u01f6\5\u0093J\2\u01ef\u01f1\5\u0095K\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\5\u0093J\2\u01f6\u01f2"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0092\3\2\2\2\u01f8\u01f9\t\5\2\2\u01f9"+
		"\u0094\3\2\2\2\u01fa\u01fd\5\u0093J\2\u01fb\u01fd\7a\2\2\u01fc\u01fa\3"+
		"\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0096\3\2\2\2\u01fe\u0200\7\62\2\2\u01ff"+
		"\u0201\5\u008dG\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0203\5\u0099M\2\u0203\u0098\3\2\2\2\u0204\u020c\5\u009b"+
		"N\2\u0205\u0207\5\u009dO\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u020d\5\u009bN\2\u020c\u0208\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u009a\3\2\2\2\u020e\u020f\t\6\2\2\u020f\u009c\3\2\2\2\u0210\u0213\5\u009b"+
		"N\2\u0211\u0213\7a\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u009e"+
		"\3\2\2\2\u0214\u0215\7\62\2\2\u0215\u0216\t\7\2\2\u0216\u0217\5\u00a1"+
		"Q\2\u0217\u00a0\3\2\2\2\u0218\u0220\5\u00a3R\2\u0219\u021b\5\u00a5S\2"+
		"\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0221\5\u00a3R"+
		"\2\u0220\u021c\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u00a2\3\2\2\2\u0222\u0223"+
		"\t\b\2\2\u0223\u00a4\3\2\2\2\u0224\u0227\5\u00a3R\2\u0225\u0227\7a\2\2"+
		"\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u00a6\3\2\2\2\u0228\u022b"+
		"\5\u00a9U\2\u0229\u022b\5\u00b5[\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2"+
		"\2\2\u022b\u00a8\3\2\2\2\u022c\u022d\5\u0085C\2\u022d\u022f\7\60\2\2\u022e"+
		"\u0230\5\u0085C\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232"+
		"\3\2\2\2\u0231\u0233\5\u00abV\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233\u0235\3\2\2\2\u0234\u0236\5\u00b3Z\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0248\3\2\2\2\u0237\u0238\7\60\2\2\u0238\u023a\5"+
		"\u0085C\2\u0239\u023b\5\u00abV\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2"+
		"\2\u023b\u023d\3\2\2\2\u023c\u023e\5\u00b3Z\2\u023d\u023c\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0248\3\2\2\2\u023f\u0240\5\u0085C\2\u0240\u0242"+
		"\5\u00abV\2\u0241\u0243\5\u00b3Z\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0248\3\2\2\2\u0244\u0245\5\u0085C\2\u0245\u0246\5\u00b3Z\2"+
		"\u0246\u0248\3\2\2\2\u0247\u022c\3\2\2\2\u0247\u0237\3\2\2\2\u0247\u023f"+
		"\3\2\2\2\u0247\u0244\3\2\2\2\u0248\u00aa\3\2\2\2\u0249\u024a\5\u00adW"+
		"\2\u024a\u024b\5\u00afX\2\u024b\u00ac\3\2\2\2\u024c\u024d\t\t\2\2\u024d"+
		"\u00ae\3\2\2\2\u024e\u0250\5\u00b1Y\2\u024f\u024e\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\u0085C\2\u0252\u00b0\3\2\2"+
		"\2\u0253\u0254\t\n\2\2\u0254\u00b2\3\2\2\2\u0255\u0256\t\13\2\2\u0256"+
		"\u00b4\3\2\2\2\u0257\u0258\5\u00b7\\\2\u0258\u025a\5\u00b9]\2\u0259\u025b"+
		"\5\u00b3Z\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u00b6\3\2\2"+
		"\2\u025c\u025e\5\u008fH\2\u025d\u025f\7\60\2\2\u025e\u025d\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0268\3\2\2\2\u0260\u0261\7\62\2\2\u0261\u0263\t"+
		"\4\2\2\u0262\u0264\5\u0091I\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2"+
		"\u0264\u0265\3\2\2\2\u0265\u0266\7\60\2\2\u0266\u0268\5\u0091I\2\u0267"+
		"\u025c\3\2\2\2\u0267\u0260\3\2\2\2\u0268\u00b8\3\2\2\2\u0269\u026a\5\u00bb"+
		"^\2\u026a\u026b\5\u00afX\2\u026b\u00ba\3\2\2\2\u026c\u026d\t\f\2\2\u026d"+
		"\u00bc\3\2\2\2\u026e\u0270\t\r\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\b_\2\2\u0274\u00be\3\2\2\2\u0275\u0276\7\61\2\2\u0276\u0277\7,"+
		"\2\2\u0277\u027b\3\2\2\2\u0278\u027a\13\2\2\2\u0279\u0278\3\2\2\2\u027a"+
		"\u027d\3\2\2\2\u027b\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027e\3\2"+
		"\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7,\2\2\u027f\u0280\7\61\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0282\b`\3\2\u0282\u00c0\3\2\2\2\u0283\u0284\7\61"+
		"\2\2\u0284\u0285\7\61\2\2\u0285\u0289\3\2\2\2\u0286\u0288\n\16\2\2\u0287"+
		"\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\ba\3\2\u028d"+
		"\u00c2\3\2\2\2+\2\u01a6\u01b1\u01b5\u01b9\u01bd\u01c1\u01c8\u01cd\u01cf"+
		"\u01d5\u01d9\u01dd\u01e3\u01e8\u01f2\u01f6\u01fc\u0200\u0208\u020c\u0212"+
		"\u021c\u0220\u0226\u022a\u022f\u0232\u0235\u023a\u023d\u0242\u0247\u024f"+
		"\u025a\u025e\u0263\u0267\u0271\u027b\u0289\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}