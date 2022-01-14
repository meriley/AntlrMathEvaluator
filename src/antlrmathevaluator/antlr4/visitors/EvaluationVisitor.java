/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlrmathevaluator.antlr4.visitors;


import antlrmathevaluator.antlr4.output.MathEvaluatorBaseVisitor;
import antlrmathevaluator.antlr4.output.MathEvaluatorParser;
import antlrmathevaluator.antlr4.output.MathEvaluatorParser.ExpressionContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.analysis.function.Acos;
import org.apache.commons.math3.analysis.function.Acosh;
import org.apache.commons.math3.analysis.function.Asin;
import org.apache.commons.math3.analysis.function.Asinh;
import org.apache.commons.math3.analysis.function.Atan;
import org.apache.commons.math3.analysis.function.Atan2;
import org.apache.commons.math3.analysis.function.Atanh;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Cosh;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Floor;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Log10;
import org.apache.commons.math3.analysis.function.Log1p;
import org.apache.commons.math3.analysis.function.Max;
import org.apache.commons.math3.analysis.function.Min;
import org.apache.commons.math3.analysis.function.Pow;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Sinh;
import org.apache.commons.math3.analysis.function.Sqrt;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.analysis.function.Tanh;

/**
 *
 * @author mark.riley
 */
public class EvaluationVisitor extends MathEvaluatorBaseVisitor<Number> {

    MathEvaluatorParser parser;

    public EvaluationVisitor(MathEvaluatorParser parser) {
        this.parser = parser;
    }

    @Override
    public Number visitMath(MathEvaluatorParser.MathContext ctx) {
        Number number = null;
        try {
            number = visit(ctx.expression());
        } catch (Exception ex) {
            reportInvalidSymbol(ctx, ctx.start);
        }
        return number;
    }

    //
    //  PRIMARIES
    //
    @Override
    public Number visitPrimaryInteger(MathEvaluatorParser.PrimaryIntegerContext ctx
    ) {
        Number number;
        String sInt = ctx.IntegerLiteral().getText();
        if ("true".equals(sInt)) {
            number = 1;
        } else if ("false".equals(sInt)) {
            number = 0;
        } else if (sInt.startsWith("0b")) /*Binary 0b01100110*/ {
            number = Long.parseLong(sInt.substring(2), 2);
        } else {
            number = Long.decode(sInt);
        }

        return number;
    }

    @Override
    public Number visitPrimaryFloat(MathEvaluatorParser.PrimaryFloatContext ctx
    ) {
        return Double.valueOf(ctx.FloatingPointLiteral().getText());
    }

    //
    //  EXPRESSIONS
    //
    @Override
    public Number visitParenExpression(MathEvaluatorParser.ParenExpressionContext ctx
    ) {
        return visit(ctx.expression());
    }

    @Override
    public Number visitPreFixExpression(MathEvaluatorParser.PreFixExpressionContext ctx
    ) {
        Number number = visit(ctx.expression());

        if (number == null) {
            reportInvalidSymbol(ctx, ctx.expression().start);
        }

        switch (ctx.op.getType()) {
            case MathEvaluatorParser.ADD:
                number = +number.doubleValue();
                break;
            case MathEvaluatorParser.SUB:
                number = -number.doubleValue();
                break;
        }

        return number;
    }

    @Override
    public Number visitBinaryNotInvExpression(MathEvaluatorParser.BinaryNotInvExpressionContext ctx
    ) {
        Number number = visit(ctx.expression());

        if (number == null) {
            reportInvalidSymbol(ctx, ctx.expression().start);
        }

        switch (ctx.op.getType()) {
            case MathEvaluatorParser.NOT:
                number = number.doubleValue() > 0 ? 0 : 1;
                break;
            case MathEvaluatorParser.BINV:
                number = ~number.longValue();
                break;
        }

        return number;
    }

    @Override
    public Number visitMutiplicativeExpression(MathEvaluatorParser.MutiplicativeExpressionContext ctx
    ) {
        Number number = null;

        try {
            switch (ctx.op.getType()) {
                case MathEvaluatorParser.MUL:
                    number = visit(ctx.lhs).doubleValue() * visit(ctx.rhs).doubleValue();
                    break;
                case MathEvaluatorParser.DIV:
                    number = visit(ctx.lhs).doubleValue() / visit(ctx.rhs).doubleValue();
                    break;
                case MathEvaluatorParser.MOD:
                    number = visit(ctx.lhs).doubleValue() % visit(ctx.rhs).doubleValue();
                    break;
            }
        } catch (NullPointerException ex) {
            reportInvalidSymbol(ctx, ctx.start);
        }

        return number;
    }

    @Override
    public Number visitAdditiveExpression(MathEvaluatorParser.AdditiveExpressionContext ctx
    ) {
        Number number = null;

        try {
            switch (ctx.op.getType()) {
                case MathEvaluatorParser.ADD:
                    number = visit(ctx.lhs).doubleValue() + visit(ctx.rhs).doubleValue();
                    break;
                case MathEvaluatorParser.SUB:
                    number = visit(ctx.lhs).doubleValue() - visit(ctx.rhs).doubleValue();
                    break;
            }
        } catch (NullPointerException ex) {
            reportInvalidSymbol(ctx, ctx.start);
        }

        return number;
    }

    @Override
    public Number visitShiftExpression(MathEvaluatorParser.ShiftExpressionContext ctx
    ) {
        Number number = null;

        try {
            switch (ctx.op.getType()) {
                case MathEvaluatorParser.LSHIFT:
                    number = visit(ctx.lhs).longValue() << visit(ctx.rhs).longValue();
                    break;
                case MathEvaluatorParser.RSHIFT:
                    number = visit(ctx.lhs).longValue() >> visit(ctx.rhs).longValue();
                    break;
                case MathEvaluatorParser.ZRSHIFT:
                    number = visit(ctx.lhs).longValue() >>> visit(ctx.rhs).longValue();
                    break;
            }
        } catch (NullPointerException ex) {
            reportInvalidSymbol(ctx, ctx.start);
        }

        return number;
    }

    @Override
    public Number visitComparitiveExpression(MathEvaluatorParser.ComparitiveExpressionContext ctx
    ) {
        Number number = null;

        try {
            switch (ctx.op.getType()) {
                case MathEvaluatorParser.GT:
                    number = visit(ctx.lhs).doubleValue() > visit(ctx.rhs).doubleValue() ? 1 : 0;
                    break;
                case MathEvaluatorParser.LT:
                    number = visit(ctx.lhs).doubleValue() < visit(ctx.rhs).doubleValue() ? 1 : 0;
                    break;
                case MathEvaluatorParser.GE:
                    number = visit(ctx.lhs).doubleValue() >= visit(ctx.rhs).doubleValue() ? 1 : 0;
                    break;
                case MathEvaluatorParser.LE:
                    number = visit(ctx.lhs).doubleValue() <= visit(ctx.rhs).doubleValue() ? 1 : 0;
                    break;
            }
        } catch (NullPointerException ex) {
            reportInvalidSymbol(ctx, ctx.start);
        }

        return number;
    }

    @Override
    public Number visitEqualityExpression(MathEvaluatorParser.EqualityExpressionContext ctx
    ) {
        Number number = null;

        try {
            switch (ctx.op.getType()) {
                case MathEvaluatorParser.EQUAL:
                    number = visit(ctx.lhs).doubleValue() == visit(ctx.rhs).doubleValue() ? 1 : 0;
                    break;
                case MathEvaluatorParser.NOTEQUAL:
                    number = visit(ctx.lhs).doubleValue() != visit(ctx.rhs).doubleValue() ? 1 : 0;
                    break;
            }
        } catch (NullPointerException ex) {
            reportInvalidSymbol(ctx, ctx.start);
        }

        return number;
    }

    @Override
    public Number visitBitwiseANDExpression(MathEvaluatorParser.BitwiseANDExpressionContext ctx
    ) {
        return visit(ctx.lhs).longValue() & visit(ctx.rhs).longValue();
    }

    @Override
    public Number visitBiteiseXORExpression(MathEvaluatorParser.BiteiseXORExpressionContext ctx
    ) {
        return visit(ctx.lhs).longValue() ^ visit(ctx.rhs).longValue();
    }

    @Override
    public Number visitBitwiseORExpression(MathEvaluatorParser.BitwiseORExpressionContext ctx
    ) {
        return visit(ctx.lhs).longValue() | visit(ctx.rhs).longValue();
    }

    @Override
    public Number visitConditionalANDExpression(MathEvaluatorParser.ConditionalANDExpressionContext ctx
    ) {
        return (visit(ctx.lhs).doubleValue() > 0 && visit(ctx.rhs).doubleValue() > 0) ? 1 : 0;
    }

    @Override
    public Number visitConditionalORExpression(MathEvaluatorParser.ConditionalORExpressionContext ctx
    ) {
        return (visit(ctx.lhs).doubleValue() > 0 || visit(ctx.rhs).doubleValue() > 0) ? 1 : 0;
    }

    @Override
    public Number visitConditionalExpression(MathEvaluatorParser.ConditionalExpressionContext ctx
    ) {
        return visit(ctx.test).doubleValue() > 0 ? visit(ctx.condTrue) : visit(ctx.condFalse);
    }

    //
    //  BUILTINS
    //
    @Override
    public Number visitBuiltinAbs(MathEvaluatorParser.BuiltinAbsContext ctx
    ) {
        return new Abs().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAcos(MathEvaluatorParser.BuiltinAcosContext ctx
    ) {
        return new Acos().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAcosh(MathEvaluatorParser.BuiltinAcoshContext ctx
    ) {
        return new Acosh().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAsin(MathEvaluatorParser.BuiltinAsinContext ctx
    ) {
        return new Asin().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAsinh(MathEvaluatorParser.BuiltinAsinhContext ctx
    ) {
        return new Asinh().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAtan(MathEvaluatorParser.BuiltinAtanContext ctx
    ) {
        return new Atan().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinCos(MathEvaluatorParser.BuiltinCosContext ctx
    ) {
        return new Cos().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinExp(MathEvaluatorParser.BuiltinExpContext ctx
    ) {
        return new Exp().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinFloor(MathEvaluatorParser.BuiltinFloorContext ctx
    ) {
        return new Floor().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinExpm1(MathEvaluatorParser.BuiltinExpm1Context ctx
    ) {
        return new Expm1().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinCosh(MathEvaluatorParser.BuiltinCoshContext ctx
    ) {
        return new Cosh().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinCeil(MathEvaluatorParser.BuiltinCeilContext ctx
    ) {
        return new Ceil().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAtanh(MathEvaluatorParser.BuiltinAtanhContext ctx
    ) {
        return new Atanh().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinAtan2(MathEvaluatorParser.BuiltinAtan2Context ctx
    ) {
        return new Atan2().value(visit(ctx.val1).doubleValue(), visit(ctx.val2).doubleValue());
    }

    @Override
    public Number visitBuiltinLog(MathEvaluatorParser.BuiltinLogContext ctx
    ) {
        return new Log().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinLog10(MathEvaluatorParser.BuiltinLog10Context ctx
    ) {
        return new Log10().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinLog1p(MathEvaluatorParser.BuiltinLog1pContext ctx
    ) {
        return new Log1p().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinMax(MathEvaluatorParser.BuiltinMaxContext ctx
    ) {
        Number max = null;
        for (ExpressionContext exp : ctx.exp) {
            if (max == null) {
                max = visit(exp);
            } else {
                max = new Max().value(max.doubleValue(), visit(exp).doubleValue());
            }
        }

        return max;
    }

    @Override
    public Number visitBuiltinMin(MathEvaluatorParser.BuiltinMinContext ctx
    ) {
        Number min = null;
        for (ExpressionContext exp : ctx.exp) {
            if (min == null) {
                min = visit(exp);
            } else {
                min = new Min().value(min.doubleValue(), visit(exp).doubleValue());
            }
        }

        return min;
    }

    @Override
    public Number visitBuiltinNeg(MathEvaluatorParser.BuiltinNegContext ctx
    ) {
        return -(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinPow(MathEvaluatorParser.BuiltinPowContext ctx
    ) {
        return new Pow().value(visit(ctx.val1).doubleValue(), visit(ctx.val2).doubleValue());
    }

    @Override
    public Number visitBuiltinRound(MathEvaluatorParser.BuiltinRoundContext ctx
    ) {
        return Math.round(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinSin(MathEvaluatorParser.BuiltinSinContext ctx
    ) {
        return new Sin().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinSinh(MathEvaluatorParser.BuiltinSinhContext ctx
    ) {
        return new Sinh().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinSqrt(MathEvaluatorParser.BuiltinSqrtContext ctx
    ) {
        return new Sqrt().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinTan(MathEvaluatorParser.BuiltinTanContext ctx
    ) {
        return new Tan().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinTanh(MathEvaluatorParser.BuiltinTanhContext ctx
    ) {
        return new Tanh().value(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinToDegrees(MathEvaluatorParser.BuiltinToDegreesContext ctx
    ) {
        return Math.toDegrees(visit(ctx.expression()).doubleValue());
    }

    @Override
    public Number visitBuiltinToRadians(MathEvaluatorParser.BuiltinToRadiansContext ctx
    ) {
        return Math.toRadians(visit(ctx.expression()).doubleValue());
    }

    private void reportInvalidSymbol(ParserRuleContext context, Token issue) {
        parser.notifyErrorListeners(issue, "Cannot find symbol for variable " + issue.getText(), new RecognitionException(parser, parser.getTokenStream(), context));
    }

}
