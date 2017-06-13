package calculator.validation;

import calculator.common.Common;

/**
 *
 * @author Michael Syme
 */
public class Validation extends Common {
    
    public static boolean isValid(final String[] args) {
        ArgTypes lastArgType = ArgTypes.NONE;
        
        if(args.length < 3) {
            System.out.println("How to use: operand operation operand. A minimum of 3 parameters are expected, seperated by space.");
            return false;
        }
        
        // validate each field before processing the arguments
        for(String a : args) {
            a = a.trim();
            
            if(a.matches(OPERAND_REGEX)) {
                if(lastArgType == ArgTypes.OPERAND) {
                    // unexpected parameter pattern following previous parameter.
                    System.out.println("Invalid input pattern. Detected 2 operands.");
                    return false;
                }
                lastArgType = ArgTypes.OPERAND;
                
            } else if(a.matches(OPERATION_REGEX)) {
                if(lastArgType == ArgTypes.OPERATION) {
                    // unexpected parameter pattern following previous parameter.
                    System.out.println("Invalid input pattern. Detected 2 operations.");
                    return false;
                }
                lastArgType = ArgTypes.OPERATION;
                
            } else {
                //invalid operand or operation
                System.out.println("Invalid operand or operation - " + a);
                return false;
            }
        }

        return true;
    }
}
