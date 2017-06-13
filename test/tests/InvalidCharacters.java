package tests;

import calculator.Calculator;
import common.TestCommon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Michael Syme
 */
public class InvalidCharacters extends TestCommon {
    
    @Test
    public void alphabet() {
        Calculator.main(new String[]{ "1", "+", "b"});
        assertEquals("Invalid operand or operation - b", out.toString().trim());
    }
    
    @Test
    public void invalidOperation() {
        Calculator.main(new String[]{ "1", "=", "1"});
        assertEquals("Invalid operand or operation - =", out.toString().trim());
    }
}
