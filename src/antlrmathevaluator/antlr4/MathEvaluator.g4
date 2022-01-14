grammar MathEvaluator;

@header{
package antlrmathevaluator.antlr4.output;

import java.util.HashMap;
import java.util.Map;
}

@lexer::members {
public static final Map<String, String> tokenNameMap;
static{
    tokenNameMap = new HashMap<>();
    for(int i = 1; i < _LITERAL_NAMES.length; i++){
        if(VOCABULARY.getLiteralName(i).charAt(1) <= 'z' && VOCABULARY.getLiteralName(i).charAt(1) >= 'a'){
            tokenNameMap.put(VOCABULARY.getLiteralName(i).toUpperCase().replace("'", ""), VOCABULARY.getLiteralName(i));
        }
    }
}
}

math
    : expression EOF
    ;

primary
    :   IntegerLiteral                                                      #   PrimaryInteger
    |   FloatingPointLiteral                                                #   PrimaryFloat
    ;

expression
    :   builtins                                                            #   BuiltinExpression
    |   primary                                                             #   PrimaryExpression
    |   '(' expression ')'                                                  #   ParenExpression
    |   (op='+' | op='-' /*| '++' | '--'*/) expression                      #   PreFixExpression
    |   (op='!' | op='~') expression                                        #   BinaryNotInvExpression
    |   lhs=expression (op='*'|op='/'|op='%') rhs=expression                #   MutiplicativeExpression
    |   lhs=expression (op='+'|op='-') rhs=expression                       #   AdditiveExpression
    |   lhs=expression (op='<<' | op='>>>' | op='>>') rhs=expression        #   ShiftExpression
    |   lhs=expression (op='<=' | op='>=' | op='>' | op='<') rhs=expression #   ComparitiveExpression
    |   lhs=expression (op='==' | op='!=') rhs=expression                   #   EqualityExpression
    |   lhs=expression  op='&'  rhs=expression                              #   BitwiseANDExpression
    |   lhs=expression  op='^'  rhs=expression                              #   BiteiseXORExpression
    |   lhs=expression  op='|'  rhs=expression                              #   BitwiseORExpression
    |   lhs=expression  op='&&' rhs=expression                              #   ConditionalANDExpression
    |   lhs=expression  op='||' rhs=expression                              #   ConditionalORExpression
    |   test=expression '?' condTrue=expression ':' condFalse=expression    #   ConditionalExpression
    ;

builtins
    :   'max'   '(' exp+=expression (',' exp+=expression)* ')'              #   BuiltinMax
    |   'min'   '(' exp+=expression (',' exp+=expression)* ')'              #   BuiltinMin
    |   'abs'   '(' expression ')'                                          #   BuiltinAbs
    |   'neg'   '(' expression ')'                                          #   BuiltinNeg
    |   'ceil'  '(' expression ')'                                          #   BuiltinCeil
    |   'floor' '(' expression ')'                                          #   BuiltinFloor
    |   'round' '(' expression ')'                                          #   BuiltinRound
    |   'acos'  '(' expression ')'                                          #   BuiltinAcos
    |   'acosh' '(' expression ')'                                          #   BuiltinAcosh
    |   'asin'  '(' expression ')'                                          #   BuiltinAsin
    |   'asinh' '(' expression ')'                                          #   BuiltinAsinh
    |   'atan'  '(' expression ')'                                          #   BuiltinAtan
    |   'atanh' '(' expression ')'                                          #   BuiltinAtanh
    |   'atan2' '(' val1=expression ',' val2=expression ')'                 #   BuiltinAtan2
    |   'cos'   '(' expression ')'                                          #   BuiltinCos
    |   'cosh'  '(' expression ')'                                          #   BuiltinCosh
    |   'exp'   '(' expression ')'                                          #   BuiltinExp
    |   'expm1' '(' expression ')'                                          #   BuiltinExpm1
    |   'log'   '(' expression ')'                                          #   BuiltinLog
    |   'log10' '(' expression ')'                                          #   BuiltinLog10
    |   'log1p' '(' expression ')'                                          #   BuiltinLog1p
    |   'pow'   '(' val1=expression ',' val2=expression ')'                 #   BuiltinPow
    |   'sin'   '(' expression ')'                                          #   BuiltinSin
    |   'sinh'  '(' expression ')'                                          #   BuiltinSinh
    |   'sqrt'  '(' expression ')'                                          #   BuiltinSqrt
    |   'tan'   '(' expression ')'                                          #   BuiltinTan
    |   'tanh'  '(' expression ')'                                          #   BuiltinTanh
    |   'toDegrees' '(' expression ')'                                      #   BuiltinToDegrees
    |   'toRadians' '(' expression ')'                                      #   BuiltinToRadians
    ;

COMMA           :   ',';

LPAREN          :   '(';
RPAREN          :   ')';

GT              :   '>';
LT              :   '<';
RSHIFT          :   '>>';
LSHIFT          :   '<<';
ZRSHIFT         :   '>>>';
NOT             :   '!';
BINV            :   '~';
QUESTION        :   '?';
COLON           :   ':';
EQUAL           :   '==';
LE              :   '<=';
GE              :   '>=';
NOTEQUAL        :   '!=';
AND             :   '&&';
OR              :   '||';
INC             :   '++';
DEC             :   '--';
ADD             :   '+';
SUB             :   '-';
MUL             :   '*';
DIV             :   '/';
BITAND          :   '&';
BITOR           :   '|';
CARET           :   '^';
MOD             :   '%';

//
//  Built-Ins
//
MAX                 :   'max';
MIN                 :   'min';
ABS                 :   'abs';
NEG                 :   'neg';
CEIL                :   'ceil';
FLOOR               :   'floor';
ROUND               :   'round';
ACOS                :   'acos';
ACOSH               :   'acosh';
ASIN                :   'asin';
ASINH               :   'asinh';
ATAN                :   'atan';
ATANH               :   'atanh';
ATAN2               :   'atan2';
COS                 :   'cos';
COSH                :   'cosh';
EXP                 :   'exp';
EXPM1               :   'expm1';
LOG                 :   'log';
LOG10               :   'log10';
LOG1P               :   'log1p';
POW                 :   'pow';
SIN                 :   'sin';
SINH                :   'sinh';
SQRT                :   'sqrt';
TAN                 :   'tan';
TANH                :   'tanh';
TODEGREES           :   'toDegrees';
TORADIANS           :   'toRadians';
//
//  Integer Literals
//

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    |   BooleanIntegerLiteral
    ;

fragment
BooleanIntegerLiteral
    :   'true'
    |   'false'
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;
fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

//
//  Floating-Point Literals
//
FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT        :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;