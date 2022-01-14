/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlrmathevaluator;


import antlrmathevaluator.antlr4.errors.EvaluationErrorListener;
import antlrmathevaluator.antlr4.output.MathEvaluatorLexer;
import antlrmathevaluator.antlr4.output.MathEvaluatorParser;
import antlrmathevaluator.antlr4.visitors.EvaluationVisitor;
import antlrmathevaluator.exceptions.EquationNotRecognizedException;
import antlrmathevaluator.exceptions.MalformedEquationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author mark.riley
 */
public class MathEvaluator {

    public static Number evaluate(String equation) throws EquationNotRecognizedException, MalformedEquationException {
        InputStream is;
        CharStream stream = null;
        try {
            is = new ByteArrayInputStream(equation.getBytes("UTF-8"));
            stream = CharStreams.fromStream(is);
        } catch (IOException ex) {
            throw new MalformedEquationException();
        }

        EvaluationErrorListener error = new EvaluationErrorListener();
        MathEvaluatorLexer lexer = new MathEvaluatorLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(error);
        TokenStream tokens = new CommonTokenStream(lexer);
        MathEvaluatorParser parser = new MathEvaluatorParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(error);
        ParseTree tree = parser.math();
        Number number = new EvaluationVisitor(parser).visit(tree);

        if (error.isEquationInvalid()) {
            throw new EquationNotRecognizedException();
        } else if (error.isEquationMalformed()) {
            throw new MalformedEquationException();
        }

        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equations = new String[]{
            //Bad Inputs
            "Byte", "1+-", 
            //Good Inputs
            "3-(-7)", "!0", "~0b111",
            "(5*10)/2", "5%2",
            "0b111 << 1", "0b1110 >> 1", "0b111 >>> 1",
            "2<=4", "4<=2", "2>=4", "4>=2", "2<4", "4<2", "2>4", "4>2",
            "2==4", "2==2",
            "0b101 & 0b010", "0b111 & 0b010",
            "0b101 | 0b010", "0b111 | 0b1101",
            "true && false", "false || true", "1 && 1", "1 && 0", "1 || 1", "1 || 0",
            "2 < 64 ? 100 + 50 : 100 - 50", "2 > 64 ? 100 + 50 : 100 - 50",
            "max(1,2,3,5,8,13,21)", "min(1,2,3,5,8,13,21)",
            "abs(-1.0)", "neg(1000)",
            "ceil(5.123446)", "floor(5.12313544)",
            "round(5.1)", "round(5.9)",
            "acos(1)",
            "acosh(1)",
            "asin(1)",
            "asinh(1)",
            "atan(1)",
            "atanh(1)",
            "atan2(1, 1)",
            "cos(1)",
            "cosh(1)",
            "exp(1)",
            "expm1(1)",
            "log(1)",
            "log10(1)",
            "log1p(1)",
            "pow(2,2)",
            "sin(1)",
            "sinh(1)",
            "sqrt(1)",
            "tan(1)",
            "tanh(1)",
            "toDegrees(1)",
            "toRadians(1)",};

        for (String eq : equations) {
            try {
                Number number = evaluate(eq);
                System.out.println(String.format("%s = %.02f", eq, number.doubleValue()));
            } catch (EquationNotRecognizedException ex) {
                Logger.getLogger(MathEvaluator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedEquationException ex) {
                Logger.getLogger(MathEvaluator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
