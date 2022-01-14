package antlrmathevaluator.antlr4.output;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathEvaluatorParser}.
 */
public interface MathEvaluatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathEvaluatorParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(MathEvaluatorParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathEvaluatorParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(MathEvaluatorParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryInteger}
	 * labeled alternative in {@link MathEvaluatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryInteger(MathEvaluatorParser.PrimaryIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryInteger}
	 * labeled alternative in {@link MathEvaluatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryInteger(MathEvaluatorParser.PrimaryIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryFloat}
	 * labeled alternative in {@link MathEvaluatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryFloat(MathEvaluatorParser.PrimaryFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryFloat}
	 * labeled alternative in {@link MathEvaluatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryFloat(MathEvaluatorParser.PrimaryFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MathEvaluatorParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MathEvaluatorParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MathEvaluatorParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MathEvaluatorParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MutiplicativeExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMutiplicativeExpression(MathEvaluatorParser.MutiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MutiplicativeExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMutiplicativeExpression(MathEvaluatorParser.MutiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(MathEvaluatorParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(MathEvaluatorParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinExpression(MathEvaluatorParser.BuiltinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinExpression(MathEvaluatorParser.BuiltinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalORExpression(MathEvaluatorParser.ConditionalORExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalORExpression(MathEvaluatorParser.ConditionalORExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(MathEvaluatorParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(MathEvaluatorParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalANDExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalANDExpression(MathEvaluatorParser.ConditionalANDExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalANDExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalANDExpression(MathEvaluatorParser.ConditionalANDExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparitiveExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparitiveExpression(MathEvaluatorParser.ComparitiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparitiveExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparitiveExpression(MathEvaluatorParser.ComparitiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseORExpression(MathEvaluatorParser.BitwiseORExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseORExpression(MathEvaluatorParser.BitwiseORExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreFixExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreFixExpression(MathEvaluatorParser.PreFixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreFixExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreFixExpression(MathEvaluatorParser.PreFixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(MathEvaluatorParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(MathEvaluatorParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryNotInvExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNotInvExpression(MathEvaluatorParser.BinaryNotInvExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryNotInvExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNotInvExpression(MathEvaluatorParser.BinaryNotInvExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BiteiseXORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBiteiseXORExpression(MathEvaluatorParser.BiteiseXORExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BiteiseXORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBiteiseXORExpression(MathEvaluatorParser.BiteiseXORExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MathEvaluatorParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MathEvaluatorParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseANDExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseANDExpression(MathEvaluatorParser.BitwiseANDExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseANDExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseANDExpression(MathEvaluatorParser.BitwiseANDExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinMax}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinMax(MathEvaluatorParser.BuiltinMaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinMax}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinMax(MathEvaluatorParser.BuiltinMaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinMin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinMin(MathEvaluatorParser.BuiltinMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinMin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinMin(MathEvaluatorParser.BuiltinMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAbs}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAbs(MathEvaluatorParser.BuiltinAbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAbs}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAbs(MathEvaluatorParser.BuiltinAbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinNeg}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinNeg(MathEvaluatorParser.BuiltinNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinNeg}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinNeg(MathEvaluatorParser.BuiltinNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinCeil}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinCeil(MathEvaluatorParser.BuiltinCeilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinCeil}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinCeil(MathEvaluatorParser.BuiltinCeilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinFloor}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinFloor(MathEvaluatorParser.BuiltinFloorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinFloor}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinFloor(MathEvaluatorParser.BuiltinFloorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinRound}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinRound(MathEvaluatorParser.BuiltinRoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinRound}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinRound(MathEvaluatorParser.BuiltinRoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAcos}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAcos(MathEvaluatorParser.BuiltinAcosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAcos}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAcos(MathEvaluatorParser.BuiltinAcosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAcosh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAcosh(MathEvaluatorParser.BuiltinAcoshContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAcosh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAcosh(MathEvaluatorParser.BuiltinAcoshContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAsin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAsin(MathEvaluatorParser.BuiltinAsinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAsin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAsin(MathEvaluatorParser.BuiltinAsinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAsinh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAsinh(MathEvaluatorParser.BuiltinAsinhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAsinh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAsinh(MathEvaluatorParser.BuiltinAsinhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAtan}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAtan(MathEvaluatorParser.BuiltinAtanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAtan}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAtan(MathEvaluatorParser.BuiltinAtanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAtanh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAtanh(MathEvaluatorParser.BuiltinAtanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAtanh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAtanh(MathEvaluatorParser.BuiltinAtanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinAtan2}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinAtan2(MathEvaluatorParser.BuiltinAtan2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinAtan2}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinAtan2(MathEvaluatorParser.BuiltinAtan2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinCos}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinCos(MathEvaluatorParser.BuiltinCosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinCos}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinCos(MathEvaluatorParser.BuiltinCosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinCosh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinCosh(MathEvaluatorParser.BuiltinCoshContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinCosh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinCosh(MathEvaluatorParser.BuiltinCoshContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinExp}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinExp(MathEvaluatorParser.BuiltinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinExp}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinExp(MathEvaluatorParser.BuiltinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinExpm1}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinExpm1(MathEvaluatorParser.BuiltinExpm1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinExpm1}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinExpm1(MathEvaluatorParser.BuiltinExpm1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinLog}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinLog(MathEvaluatorParser.BuiltinLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinLog}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinLog(MathEvaluatorParser.BuiltinLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinLog10}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinLog10(MathEvaluatorParser.BuiltinLog10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinLog10}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinLog10(MathEvaluatorParser.BuiltinLog10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinLog1p}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinLog1p(MathEvaluatorParser.BuiltinLog1pContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinLog1p}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinLog1p(MathEvaluatorParser.BuiltinLog1pContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinPow}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinPow(MathEvaluatorParser.BuiltinPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinPow}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinPow(MathEvaluatorParser.BuiltinPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinSin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinSin(MathEvaluatorParser.BuiltinSinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinSin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinSin(MathEvaluatorParser.BuiltinSinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinSinh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinSinh(MathEvaluatorParser.BuiltinSinhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinSinh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinSinh(MathEvaluatorParser.BuiltinSinhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinSqrt}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinSqrt(MathEvaluatorParser.BuiltinSqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinSqrt}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinSqrt(MathEvaluatorParser.BuiltinSqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinTan}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinTan(MathEvaluatorParser.BuiltinTanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinTan}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinTan(MathEvaluatorParser.BuiltinTanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinTanh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinTanh(MathEvaluatorParser.BuiltinTanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinTanh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinTanh(MathEvaluatorParser.BuiltinTanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinToDegrees}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinToDegrees(MathEvaluatorParser.BuiltinToDegreesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinToDegrees}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinToDegrees(MathEvaluatorParser.BuiltinToDegreesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinToRadians}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinToRadians(MathEvaluatorParser.BuiltinToRadiansContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinToRadians}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinToRadians(MathEvaluatorParser.BuiltinToRadiansContext ctx);
}