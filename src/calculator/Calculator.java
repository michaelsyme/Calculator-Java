package calculator;

import calculator.common.Common;
import calculator.operations.Process;
import calculator.validation.Validation;

/**
 *
 * @author Michael Syme
 */
public class Calculator extends Common {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(!Validation.isValid(args)) {
            System.exit(0);
        }
        
        Process p = new Process(args);
        
        System.out.println("Result: " + p.calulateResult());
        
        System.exit(0);
    }
}
