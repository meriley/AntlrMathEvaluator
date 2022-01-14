package antlrmathevaluator.antlr4.output;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathEvaluatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathEvaluatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathEvaluatorParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(MathEvaluatorParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryInteger}
	 * labeled alternative in {@link MathEvaluatorParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryInteger(MathEvaluatorParser.PrimaryIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryFloat}
	 * labeled alternative in {@link MathEvaluatorParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryFloat(MathEvaluatorParser.PrimaryFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MathEvaluatorParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MathEvaluatorParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MutiplicativeExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutiplicativeExpression(MathEvaluatorParser.MutiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MathEvaluatorParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinExpression(MathEvaluatorParser.BuiltinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalORExpression(MathEvaluatorParser.ConditionalORExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(MathEvaluatorParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalANDExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalANDExpression(MathEvaluatorParser.ConditionalANDExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparitiveExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparitiveExpression(MathEvaluatorParser.ComparitiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseORExpression(MathEvaluatorParser.BitwiseORExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreFixExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFixExpression(MathEvaluatorParser.PreFixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(MathEvaluatorParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryNotInvExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNotInvExpression(MathEvaluatorParser.BinaryNotInvExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BiteiseXORExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiteiseXORExpression(MathEvaluatorParser.BiteiseXORExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MathEvaluatorParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseANDExpression}
	 * labeled alternative in {@link MathEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseANDExpression(MathEvaluatorParser.BitwiseANDExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinMax}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinMax(MathEvaluatorParser.BuiltinMaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinMin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinMin(MathEvaluatorParser.BuiltinMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAbs}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAbs(MathEvaluatorParser.BuiltinAbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinNeg}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinNeg(MathEvaluatorParser.BuiltinNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinCeil}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinCeil(MathEvaluatorParser.BuiltinCeilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinFloor}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinFloor(MathEvaluatorParser.BuiltinFloorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinRound}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinRound(MathEvaluatorParser.BuiltinRoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAcos}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAcos(MathEvaluatorParser.BuiltinAcosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAcosh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAcosh(MathEvaluatorParser.BuiltinAcoshContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAsin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAsin(MathEvaluatorParser.BuiltinAsinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAsinh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAsinh(MathEvaluatorParser.BuiltinAsinhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAtan}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAtan(MathEvaluatorParser.BuiltinAtanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAtanh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAtanh(MathEvaluatorParser.BuiltinAtanhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinAtan2}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinAtan2(MathEvaluatorParser.BuiltinAtan2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinCos}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinCos(MathEvaluatorParser.BuiltinCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinCosh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinCosh(MathEvaluatorParser.BuiltinCoshContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinExp}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinExp(MathEvaluatorParser.BuiltinExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinExpm1}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinExpm1(MathEvaluatorParser.BuiltinExpm1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinLog}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinLog(MathEvaluatorParser.BuiltinLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinLog10}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinLog10(MathEvaluatorParser.BuiltinLog10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinLog1p}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinLog1p(MathEvaluatorParser.BuiltinLog1pContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinPow}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinPow(MathEvaluatorParser.BuiltinPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinSin}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinSin(MathEvaluatorParser.BuiltinSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinSinh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinSinh(MathEvaluatorParser.BuiltinSinhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinSqrt}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinSqrt(MathEvaluatorParser.BuiltinSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinTan}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinTan(MathEvaluatorParser.BuiltinTanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinTanh}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinTanh(MathEvaluatorParser.BuiltinTanhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinToDegrees}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinToDegrees(MathEvaluatorParser.BuiltinToDegreesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinToRadians}
	 * labeled alternative in {@link MathEvaluatorParser#builtins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinToRadians(MathEvaluatorParser.BuiltinToRadiansContext ctx);
}