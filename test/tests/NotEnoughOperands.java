package tests;

import calculator.Calculator;
import common.TestCommon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Syme
 */
public class NotEnoughOperands extends TestCommon {
    
    @Test
    public void oneOperand() {
        Calculator.main(new String[]{ "1"});
        assertEquals("How to use: operand operation operand. A minimum of 3 parameters are expected, seperated by space.", out.toString().trim());
    }
    
    @Test
    public void oneOperandAndOperation() {
        Calculator.main(new String[]{ "1", "+"});
        assertEquals("How to use: operand operation operand. A minimum of 3 parameters are expected, seperated by space.", out.toString().trim());
    }
}
