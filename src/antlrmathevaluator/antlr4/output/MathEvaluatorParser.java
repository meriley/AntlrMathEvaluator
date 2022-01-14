package antlrmathevaluator.antlr4.output;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathEvaluatorParser extends Parser {
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
	public static final int
		RULE_math = 0, RULE_primary = 1, RULE_expression = 2, RULE_builtins = 3;
	public static final String[] ruleNames = {
		"math", "primary", "expression", "builtins"
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

	@Override
	public String getGrammarFileName() { return "MathEvaluator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathEvaluatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MathContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MathEvaluatorParser.EOF, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expression(0);
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryIntegerContext extends PrimaryContext {
		public TerminalNode IntegerLiteral() { return getToken(MathEvaluatorParser.IntegerLiteral, 0); }
		public PrimaryIntegerContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterPrimaryInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitPrimaryInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitPrimaryInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryFloatContext extends PrimaryContext {
		public TerminalNode FloatingPointLiteral() { return getToken(MathEvaluatorParser.FloatingPointLiteral, 0); }
		public PrimaryFloatContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterPrimaryFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitPrimaryFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitPrimaryFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primary);
		try {
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new PrimaryFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(FloatingPointLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MutiplicativeExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MutiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterMutiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitMutiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitMutiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext test;
		public ExpressionContext condTrue;
		public ExpressionContext condFalse;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinExpressionContext extends ExpressionContext {
		public BuiltinsContext builtins() {
			return getRuleContext(BuiltinsContext.class,0);
		}
		public BuiltinExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalORExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalORExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterConditionalORExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitConditionalORExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitConditionalORExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalANDExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalANDExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterConditionalANDExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitConditionalANDExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitConditionalANDExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparitiveExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparitiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterComparitiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitComparitiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitComparitiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseORExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseORExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBitwiseORExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBitwiseORExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBitwiseORExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreFixExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreFixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterPreFixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitPreFixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitPreFixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryNotInvExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BinaryNotInvExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBinaryNotInvExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBinaryNotInvExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBinaryNotInvExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BiteiseXORExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BiteiseXORExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBiteiseXORExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBiteiseXORExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBiteiseXORExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseANDExpressionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseANDExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBitwiseANDExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBitwiseANDExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBitwiseANDExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case ABS:
			case NEG:
			case CEIL:
			case FLOOR:
			case ROUND:
			case ACOS:
			case ACOSH:
			case ASIN:
			case ASINH:
			case ATAN:
			case ATANH:
			case ATAN2:
			case COS:
			case COSH:
			case EXP:
			case EXPM1:
			case LOG:
			case LOG10:
			case LOG1P:
			case POW:
			case SIN:
			case SINH:
			case SQRT:
			case TAN:
			case TANH:
			case TODEGREES:
			case TORADIANS:
				{
				_localctx = new BuiltinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16);
				builtins();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				primary();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				match(LPAREN);
				setState(19);
				expression(0);
				setState(20);
				match(RPAREN);
				}
				break;
			case ADD:
			case SUB:
				{
				_localctx = new PreFixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(22);
					((PreFixExpressionContext)_localctx).op = match(ADD);
					}
					break;
				case SUB:
					{
					setState(23);
					((PreFixExpressionContext)_localctx).op = match(SUB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(26);
				expression(13);
				}
				break;
			case NOT:
			case BINV:
				{
				_localctx = new BinaryNotInvExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(27);
					((BinaryNotInvExpressionContext)_localctx).op = match(NOT);
					}
					break;
				case BINV:
					{
					setState(28);
					((BinaryNotInvExpressionContext)_localctx).op = match(BINV);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31);
				expression(12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MutiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MutiplicativeExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(34);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(38);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(35);
							((MutiplicativeExpressionContext)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(36);
							((MutiplicativeExpressionContext)_localctx).op = match(DIV);
							}
							break;
						case MOD:
							{
							setState(37);
							((MutiplicativeExpressionContext)_localctx).op = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(40);
						((MutiplicativeExpressionContext)_localctx).rhs = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(41);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(44);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(42);
							((AdditiveExpressionContext)_localctx).op = match(ADD);
							}
							break;
						case SUB:
							{
							setState(43);
							((AdditiveExpressionContext)_localctx).op = match(SUB);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(46);
						((AdditiveExpressionContext)_localctx).rhs = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(51);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LSHIFT:
							{
							setState(48);
							((ShiftExpressionContext)_localctx).op = match(LSHIFT);
							}
							break;
						case ZRSHIFT:
							{
							setState(49);
							((ShiftExpressionContext)_localctx).op = match(ZRSHIFT);
							}
							break;
						case RSHIFT:
							{
							setState(50);
							((ShiftExpressionContext)_localctx).op = match(RSHIFT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(53);
						((ShiftExpressionContext)_localctx).rhs = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ComparitiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparitiveExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(59);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LE:
							{
							setState(55);
							((ComparitiveExpressionContext)_localctx).op = match(LE);
							}
							break;
						case GE:
							{
							setState(56);
							((ComparitiveExpressionContext)_localctx).op = match(GE);
							}
							break;
						case GT:
							{
							setState(57);
							((ComparitiveExpressionContext)_localctx).op = match(GT);
							}
							break;
						case LT:
							{
							setState(58);
							((ComparitiveExpressionContext)_localctx).op = match(LT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(61);
						((ComparitiveExpressionContext)_localctx).rhs = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(65);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(63);
							((EqualityExpressionContext)_localctx).op = match(EQUAL);
							}
							break;
						case NOTEQUAL:
							{
							setState(64);
							((EqualityExpressionContext)_localctx).op = match(NOTEQUAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(67);
						((EqualityExpressionContext)_localctx).rhs = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseANDExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseANDExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						((BitwiseANDExpressionContext)_localctx).op = match(BITAND);
						setState(70);
						((BitwiseANDExpressionContext)_localctx).rhs = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new BiteiseXORExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BiteiseXORExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						((BiteiseXORExpressionContext)_localctx).op = match(CARET);
						setState(73);
						((BiteiseXORExpressionContext)_localctx).rhs = expression(6);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseORExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseORExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						((BitwiseORExpressionContext)_localctx).op = match(BITOR);
						setState(76);
						((BitwiseORExpressionContext)_localctx).rhs = expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalANDExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalANDExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						((ConditionalANDExpressionContext)_localctx).op = match(AND);
						setState(79);
						((ConditionalANDExpressionContext)_localctx).rhs = expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalORExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalORExpressionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(81);
						((ConditionalORExpressionContext)_localctx).op = match(OR);
						setState(82);
						((ConditionalORExpressionContext)_localctx).rhs = expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(84);
						match(QUESTION);
						setState(85);
						((ConditionalExpressionContext)_localctx).condTrue = expression(0);
						setState(86);
						match(COLON);
						setState(87);
						((ConditionalExpressionContext)_localctx).condFalse = expression(2);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BuiltinsContext extends ParserRuleContext {
		public BuiltinsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtins; }
	 
		public BuiltinsContext() { }
		public void copyFrom(BuiltinsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BuiltinFloorContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinFloorContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinFloor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinFloor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinTanContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinTanContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAtanhContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAtanhContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAtanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAtanh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAtanh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinExpContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinExpContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinTanhContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinTanhContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinTanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinTanh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinTanh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAtanContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAtanContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAtan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAtan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAtan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAtan2Context extends BuiltinsContext {
		public ExpressionContext val1;
		public ExpressionContext val2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BuiltinAtan2Context(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAtan2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAtan2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAtan2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinPowContext extends BuiltinsContext {
		public ExpressionContext val1;
		public ExpressionContext val2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BuiltinPowContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinSinContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinSinContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinSqrtContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinSqrtContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinMinContext extends BuiltinsContext {
		public ExpressionContext expression;
		public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BuiltinMinContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinNegContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinNegContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinCosContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinCosContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinToDegreesContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinToDegreesContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinToDegrees(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinToDegrees(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinToDegrees(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinLogContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinLogContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAcoshContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAcoshContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAcosh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAcosh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAcosh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinCoshContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinCoshContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinCosh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinCosh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinCosh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAsinhContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAsinhContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAsinh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAsinh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAsinh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinCeilContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinCeilContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinCeil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinCeil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinCeil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAcosContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAcosContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAcos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAcos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAcos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAbsContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAbsContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAbs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinMaxContext extends BuiltinsContext {
		public ExpressionContext expression;
		public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BuiltinMaxContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinMax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinAsinContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinAsinContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinAsin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinAsin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinAsin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinExpm1Context extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinExpm1Context(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinExpm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinExpm1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinExpm1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinToRadiansContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinToRadiansContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinToRadians(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinToRadians(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinToRadians(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinRoundContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinRoundContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinRound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinRound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinRound(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinLog10Context extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinLog10Context(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinLog10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinLog10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinLog10(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinLog1pContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinLog1pContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinLog1p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinLog1p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinLog1p(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinSinhContext extends BuiltinsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltinSinhContext(BuiltinsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).enterBuiltinSinh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathEvaluatorListener ) ((MathEvaluatorListener)listener).exitBuiltinSinh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathEvaluatorVisitor ) return ((MathEvaluatorVisitor<? extends T>)visitor).visitBuiltinSinh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinsContext builtins() throws RecognitionException {
		BuiltinsContext _localctx = new BuiltinsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_builtins);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
				_localctx = new BuiltinMaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(MAX);
				setState(95);
				match(LPAREN);
				setState(96);
				((BuiltinMaxContext)_localctx).expression = expression(0);
				((BuiltinMaxContext)_localctx).exp.add(((BuiltinMaxContext)_localctx).expression);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(97);
					match(COMMA);
					setState(98);
					((BuiltinMaxContext)_localctx).expression = expression(0);
					((BuiltinMaxContext)_localctx).exp.add(((BuiltinMaxContext)_localctx).expression);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(RPAREN);
				}
				break;
			case MIN:
				_localctx = new BuiltinMinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(MIN);
				setState(107);
				match(LPAREN);
				setState(108);
				((BuiltinMinContext)_localctx).expression = expression(0);
				((BuiltinMinContext)_localctx).exp.add(((BuiltinMinContext)_localctx).expression);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					((BuiltinMinContext)_localctx).expression = expression(0);
					((BuiltinMinContext)_localctx).exp.add(((BuiltinMinContext)_localctx).expression);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(RPAREN);
				}
				break;
			case ABS:
				_localctx = new BuiltinAbsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(ABS);
				setState(119);
				match(LPAREN);
				setState(120);
				expression(0);
				setState(121);
				match(RPAREN);
				}
				break;
			case NEG:
				_localctx = new BuiltinNegContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(NEG);
				setState(124);
				match(LPAREN);
				setState(125);
				expression(0);
				setState(126);
				match(RPAREN);
				}
				break;
			case CEIL:
				_localctx = new BuiltinCeilContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(CEIL);
				setState(129);
				match(LPAREN);
				setState(130);
				expression(0);
				setState(131);
				match(RPAREN);
				}
				break;
			case FLOOR:
				_localctx = new BuiltinFloorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(FLOOR);
				setState(134);
				match(LPAREN);
				setState(135);
				expression(0);
				setState(136);
				match(RPAREN);
				}
				break;
			case ROUND:
				_localctx = new BuiltinRoundContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(ROUND);
				setState(139);
				match(LPAREN);
				setState(140);
				expression(0);
				setState(141);
				match(RPAREN);
				}
				break;
			case ACOS:
				_localctx = new BuiltinAcosContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(ACOS);
				setState(144);
				match(LPAREN);
				setState(145);
				expression(0);
				setState(146);
				match(RPAREN);
				}
				break;
			case ACOSH:
				_localctx = new BuiltinAcoshContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				match(ACOSH);
				setState(149);
				match(LPAREN);
				setState(150);
				expression(0);
				setState(151);
				match(RPAREN);
				}
				break;
			case ASIN:
				_localctx = new BuiltinAsinContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				match(ASIN);
				setState(154);
				match(LPAREN);
				setState(155);
				expression(0);
				setState(156);
				match(RPAREN);
				}
				break;
			case ASINH:
				_localctx = new BuiltinAsinhContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				match(ASINH);
				setState(159);
				match(LPAREN);
				setState(160);
				expression(0);
				setState(161);
				match(RPAREN);
				}
				break;
			case ATAN:
				_localctx = new BuiltinAtanContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(163);
				match(ATAN);
				setState(164);
				match(LPAREN);
				setState(165);
				expression(0);
				setState(166);
				match(RPAREN);
				}
				break;
			case ATANH:
				_localctx = new BuiltinAtanhContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(168);
				match(ATANH);
				setState(169);
				match(LPAREN);
				setState(170);
				expression(0);
				setState(171);
				match(RPAREN);
				}
				break;
			case ATAN2:
				_localctx = new BuiltinAtan2Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(173);
				match(ATAN2);
				setState(174);
				match(LPAREN);
				setState(175);
				((BuiltinAtan2Context)_localctx).val1 = expression(0);
				setState(176);
				match(COMMA);
				setState(177);
				((BuiltinAtan2Context)_localctx).val2 = expression(0);
				setState(178);
				match(RPAREN);
				}
				break;
			case COS:
				_localctx = new BuiltinCosContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(180);
				match(COS);
				setState(181);
				match(LPAREN);
				setState(182);
				expression(0);
				setState(183);
				match(RPAREN);
				}
				break;
			case COSH:
				_localctx = new BuiltinCoshContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(185);
				match(COSH);
				setState(186);
				match(LPAREN);
				setState(187);
				expression(0);
				setState(188);
				match(RPAREN);
				}
				break;
			case EXP:
				_localctx = new BuiltinExpContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(190);
				match(EXP);
				setState(191);
				match(LPAREN);
				setState(192);
				expression(0);
				setState(193);
				match(RPAREN);
				}
				break;
			case EXPM1:
				_localctx = new BuiltinExpm1Context(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(195);
				match(EXPM1);
				setState(196);
				match(LPAREN);
				setState(197);
				expression(0);
				setState(198);
				match(RPAREN);
				}
				break;
			case LOG:
				_localctx = new BuiltinLogContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(200);
				match(LOG);
				setState(201);
				match(LPAREN);
				setState(202);
				expression(0);
				setState(203);
				match(RPAREN);
				}
				break;
			case LOG10:
				_localctx = new BuiltinLog10Context(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(205);
				match(LOG10);
				setState(206);
				match(LPAREN);
				setState(207);
				expression(0);
				setState(208);
				match(RPAREN);
				}
				break;
			case LOG1P:
				_localctx = new BuiltinLog1pContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(210);
				match(LOG1P);
				setState(211);
				match(LPAREN);
				setState(212);
				expression(0);
				setState(213);
				match(RPAREN);
				}
				break;
			case POW:
				_localctx = new BuiltinPowContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(215);
				match(POW);
				setState(216);
				match(LPAREN);
				setState(217);
				((BuiltinPowContext)_localctx).val1 = expression(0);
				setState(218);
				match(COMMA);
				setState(219);
				((BuiltinPowContext)_localctx).val2 = expression(0);
				setState(220);
				match(RPAREN);
				}
				break;
			case SIN:
				_localctx = new BuiltinSinContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				match(SIN);
				setState(223);
				match(LPAREN);
				setState(224);
				expression(0);
				setState(225);
				match(RPAREN);
				}
				break;
			case SINH:
				_localctx = new BuiltinSinhContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(227);
				match(SINH);
				setState(228);
				match(LPAREN);
				setState(229);
				expression(0);
				setState(230);
				match(RPAREN);
				}
				break;
			case SQRT:
				_localctx = new BuiltinSqrtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(232);
				match(SQRT);
				setState(233);
				match(LPAREN);
				setState(234);
				expression(0);
				setState(235);
				match(RPAREN);
				}
				break;
			case TAN:
				_localctx = new BuiltinTanContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(237);
				match(TAN);
				setState(238);
				match(LPAREN);
				setState(239);
				expression(0);
				setState(240);
				match(RPAREN);
				}
				break;
			case TANH:
				_localctx = new BuiltinTanhContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(242);
				match(TANH);
				setState(243);
				match(LPAREN);
				setState(244);
				expression(0);
				setState(245);
				match(RPAREN);
				}
				break;
			case TODEGREES:
				_localctx = new BuiltinToDegreesContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(247);
				match(TODEGREES);
				setState(248);
				match(LPAREN);
				setState(249);
				expression(0);
				setState(250);
				match(RPAREN);
				}
				break;
			case TORADIANS:
				_localctx = new BuiltinToRadiansContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(252);
				match(TORADIANS);
				setState(253);
				match(LPAREN);
				setState(254);
				expression(0);
				setState(255);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\5\3\20\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\4\5\4 \n\4\3\4\5\4#\n\4\3\4"+
		"\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\3\5\3\5\3\5\3\5\7\5f\n\5\f"+
		"\5\16\5i\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0104\n\5\3\5\2\3\6\6\2\4\6\b\2\2\2\u013a\2\n\3\2\2\2\4\17\3\2\2"+
		"\2\6\"\3\2\2\2\b\u0103\3\2\2\2\n\13\5\6\4\2\13\f\7\2\2\3\f\3\3\2\2\2\r"+
		"\20\7<\2\2\16\20\7=\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\5\3\2\2\2\21\22"+
		"\b\4\1\2\22#\5\b\5\2\23#\5\4\3\2\24\25\7\4\2\2\25\26\5\6\4\2\26\27\7\5"+
		"\2\2\27#\3\2\2\2\30\33\7\27\2\2\31\33\7\30\2\2\32\30\3\2\2\2\32\31\3\2"+
		"\2\2\33\34\3\2\2\2\34#\5\6\4\17\35 \7\13\2\2\36 \7\f\2\2\37\35\3\2\2\2"+
		"\37\36\3\2\2\2 !\3\2\2\2!#\5\6\4\16\"\21\3\2\2\2\"\23\3\2\2\2\"\24\3\2"+
		"\2\2\"\32\3\2\2\2\"\37\3\2\2\2#]\3\2\2\2$(\f\r\2\2%)\7\31\2\2&)\7\32\2"+
		"\2\')\7\36\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*\\\5\6\4\16+."+
		"\f\f\2\2,/\7\27\2\2-/\7\30\2\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\\\5"+
		"\6\4\r\61\65\f\13\2\2\62\66\7\t\2\2\63\66\7\n\2\2\64\66\7\b\2\2\65\62"+
		"\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\\\5\6\4\f8=\f\n"+
		"\2\29>\7\20\2\2:>\7\21\2\2;>\7\6\2\2<>\7\7\2\2=9\3\2\2\2=:\3\2\2\2=;\3"+
		"\2\2\2=<\3\2\2\2>?\3\2\2\2?\\\5\6\4\13@C\f\t\2\2AD\7\17\2\2BD\7\22\2\2"+
		"CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2E\\\5\6\4\nFG\f\b\2\2GH\7\33\2\2H\\\5\6"+
		"\4\tIJ\f\7\2\2JK\7\35\2\2K\\\5\6\4\bLM\f\6\2\2MN\7\34\2\2N\\\5\6\4\7O"+
		"P\f\5\2\2PQ\7\23\2\2Q\\\5\6\4\6RS\f\4\2\2ST\7\24\2\2T\\\5\6\4\5UV\f\3"+
		"\2\2VW\7\r\2\2WX\5\6\4\2XY\7\16\2\2YZ\5\6\4\4Z\\\3\2\2\2[$\3\2\2\2[+\3"+
		"\2\2\2[\61\3\2\2\2[8\3\2\2\2[@\3\2\2\2[F\3\2\2\2[I\3\2\2\2[L\3\2\2\2["+
		"O\3\2\2\2[R\3\2\2\2[U\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\7\3\2\2"+
		"\2_]\3\2\2\2`a\7\37\2\2ab\7\4\2\2bg\5\6\4\2cd\7\3\2\2df\5\6\4\2ec\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\5\2\2k\u0104"+
		"\3\2\2\2lm\7 \2\2mn\7\4\2\2ns\5\6\4\2op\7\3\2\2pr\5\6\4\2qo\3\2\2\2ru"+
		"\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2w\u0104\3\2"+
		"\2\2xy\7!\2\2yz\7\4\2\2z{\5\6\4\2{|\7\5\2\2|\u0104\3\2\2\2}~\7\"\2\2~"+
		"\177\7\4\2\2\177\u0080\5\6\4\2\u0080\u0081\7\5\2\2\u0081\u0104\3\2\2\2"+
		"\u0082\u0083\7#\2\2\u0083\u0084\7\4\2\2\u0084\u0085\5\6\4\2\u0085\u0086"+
		"\7\5\2\2\u0086\u0104\3\2\2\2\u0087\u0088\7$\2\2\u0088\u0089\7\4\2\2\u0089"+
		"\u008a\5\6\4\2\u008a\u008b\7\5\2\2\u008b\u0104\3\2\2\2\u008c\u008d\7%"+
		"\2\2\u008d\u008e\7\4\2\2\u008e\u008f\5\6\4\2\u008f\u0090\7\5\2\2\u0090"+
		"\u0104\3\2\2\2\u0091\u0092\7&\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\6"+
		"\4\2\u0094\u0095\7\5\2\2\u0095\u0104\3\2\2\2\u0096\u0097\7\'\2\2\u0097"+
		"\u0098\7\4\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7\5\2\2\u009a\u0104\3\2"+
		"\2\2\u009b\u009c\7(\2\2\u009c\u009d\7\4\2\2\u009d\u009e\5\6\4\2\u009e"+
		"\u009f\7\5\2\2\u009f\u0104\3\2\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a2\7\4"+
		"\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\7\5\2\2\u00a4\u0104\3\2\2\2\u00a5"+
		"\u00a6\7*\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9\7\5"+
		"\2\2\u00a9\u0104\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab\u00ac\7\4\2\2\u00ac"+
		"\u00ad\5\6\4\2\u00ad\u00ae\7\5\2\2\u00ae\u0104\3\2\2\2\u00af\u00b0\7,"+
		"\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\5\6\4\2\u00b2\u00b3\7\3\2\2\u00b3"+
		"\u00b4\5\6\4\2\u00b4\u00b5\7\5\2\2\u00b5\u0104\3\2\2\2\u00b6\u00b7\7-"+
		"\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\5\2\2\u00ba"+
		"\u0104\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\5\6"+
		"\4\2\u00be\u00bf\7\5\2\2\u00bf\u0104\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1"+
		"\u00c2\7\4\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00c4\7\5\2\2\u00c4\u0104\3\2"+
		"\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\5\6\4\2\u00c8"+
		"\u00c9\7\5\2\2\u00c9\u0104\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7"+
		"\4\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7\5\2\2\u00ce\u0104\3\2\2\2\u00cf"+
		"\u00d0\7\62\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7"+
		"\5\2\2\u00d3\u0104\3\2\2\2\u00d4\u00d5\7\63\2\2\u00d5\u00d6\7\4\2\2\u00d6"+
		"\u00d7\5\6\4\2\u00d7\u00d8\7\5\2\2\u00d8\u0104\3\2\2\2\u00d9\u00da\7\64"+
		"\2\2\u00da\u00db\7\4\2\2\u00db\u00dc\5\6\4\2\u00dc\u00dd\7\3\2\2\u00dd"+
		"\u00de\5\6\4\2\u00de\u00df\7\5\2\2\u00df\u0104\3\2\2\2\u00e0\u00e1\7\65"+
		"\2\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7\5\2\2\u00e4"+
		"\u0104\3\2\2\2\u00e5\u00e6\7\66\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5"+
		"\6\4\2\u00e8\u00e9\7\5\2\2\u00e9\u0104\3\2\2\2\u00ea\u00eb\7\67\2\2\u00eb"+
		"\u00ec\7\4\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\7\5\2\2\u00ee\u0104\3\2"+
		"\2\2\u00ef\u00f0\78\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5\6\4\2\u00f2"+
		"\u00f3\7\5\2\2\u00f3\u0104\3\2\2\2\u00f4\u00f5\79\2\2\u00f5\u00f6\7\4"+
		"\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\7\5\2\2\u00f8\u0104\3\2\2\2\u00f9"+
		"\u00fa\7:\2\2\u00fa\u00fb\7\4\2\2\u00fb\u00fc\5\6\4\2\u00fc\u00fd\7\5"+
		"\2\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\7;\2\2\u00ff\u0100\7\4\2\2\u0100"+
		"\u0101\5\6\4\2\u0101\u0102\7\5\2\2\u0102\u0104\3\2\2\2\u0103`\3\2\2\2"+
		"\u0103l\3\2\2\2\u0103x\3\2\2\2\u0103}\3\2\2\2\u0103\u0082\3\2\2\2\u0103"+
		"\u0087\3\2\2\2\u0103\u008c\3\2\2\2\u0103\u0091\3\2\2\2\u0103\u0096\3\2"+
		"\2\2\u0103\u009b\3\2\2\2\u0103\u00a0\3\2\2\2\u0103\u00a5\3\2\2\2\u0103"+
		"\u00aa\3\2\2\2\u0103\u00af\3\2\2\2\u0103\u00b6\3\2\2\2\u0103\u00bb\3\2"+
		"\2\2\u0103\u00c0\3\2\2\2\u0103\u00c5\3\2\2\2\u0103\u00ca\3\2\2\2\u0103"+
		"\u00cf\3\2\2\2\u0103\u00d4\3\2\2\2\u0103\u00d9\3\2\2\2\u0103\u00e0\3\2"+
		"\2\2\u0103\u00e5\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00ef\3\2\2\2\u0103"+
		"\u00f4\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fe\3\2\2\2\u0104\t\3\2\2\2"+
		"\20\17\32\37\"(.\65=C[]gs\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}