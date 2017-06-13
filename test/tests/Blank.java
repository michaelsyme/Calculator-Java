package tests;

import calculator.Calculator;
import common.TestCommon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Syme
 */
public class Blank extends TestCommon {
    
    @Test
    public void blankInput() {
        Calculator.main(new String[]{});
        assertEquals("How to use: operand operation operand. A minimum of 3 parameters are expected, seperated by space.", out.toString().trim());
    }
}
