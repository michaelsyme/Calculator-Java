package calculator.common;

/**
 *
 * @author Michael Syme
 */
public class Common {
    public static String OPERAND_REGEX = "^[0-9]+[.]?[0-9]*";
    // Iteration 2+
    // public static String OPERATION_REGEX = "^[+|-|*|/|^|sin|cos|tan]$";
    public static String OPERATION_REGEX = "^[\\+|\\-|\\*|/|\\^]$";
    
    // enum used to track what the current argument type is being validated
    public enum ArgTypes {
        OPERAND,
        OPERATION,
        NONE
    };
}
