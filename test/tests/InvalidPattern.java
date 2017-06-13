package tests;

import calculator.Calculator;
import common.TestCommon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Michael Syme
 */
public class InvalidPattern extends TestCommon {
    
    @Test
    public void operandsSideBySide() {
        Calculator.main(new String[]{ "1", "1", "+"});
        assertEquals("Invalid input pattern. Detected 2 operands.", out.toString().trim());
    }
    
    @Test
    public void operationsSideBySide() {
        Calculator.main(new String[]{ "1", "+", "+"});
        assertEquals("Invalid input pattern. Detected 2 operations.", out.toString().trim());
    }
}
