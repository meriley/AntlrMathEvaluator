/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlrmathevaluator.antlr4.errors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author mark.riley
 */
public class EvaluationErrorListener extends BaseErrorListener{

    private boolean eqMalformed = false;
    private boolean eqInvalid = false;
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        if (recognizer instanceof Parser) {
            eqMalformed = true;
        } else /*LEXER Error*/ {
            eqInvalid = true;
        }
    }

    public boolean isEquationInvalid() {
        return eqInvalid;
    }

    public boolean isEquationMalformed() {
        return eqMalformed;
    }
    
    
}
