package tests;

import calculator.Calculator;
import common.TestCommon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Michael Syme
 */
public class ValidEquations extends TestCommon {
    
    @Test
    public void plus() {
        Calculator.main(new String[]{ "1", "+", "10"});
        assertEquals("Result: 11.0", out.toString().trim());
    }
    
    @Test
    public void minusZero() {
        Calculator.main(new String[]{ "1", "-", "1"});
        assertEquals("Result: 0.0", out.toString().trim());
    }
    
    @Test
    public void minusNegative() {
        Calculator.main(new String[]{ "1", "-", "2"});
        assertEquals("Result: -1.0", out.toString().trim());
    }
    
    @Test
    public void multiply() {
        Calculator.main(new String[]{ "3", "*", "5"});
        assertEquals("Result: 15.0", out.toString().trim());
    }
    
    @Test
    public void divideEven() {
        Calculator.main(new String[]{ "6", "/", "3"});
        assertEquals("Result: 2.0", out.toString().trim());
    }
    
    @Test
    public void divideFraction() {
        Calculator.main(new String[]{ "3", "/", "6"});
        assertEquals("Result: 0.5", out.toString().trim());
    }
    
    @Test
    public void divideZero() {
        Calculator.main(new String[]{ "3", "/", "0"});
        assertEquals("Result: Infinity", out.toString().trim());
    }
    
    @Test
    public void squared() {
        Calculator.main(new String[]{ "3", "^", "6"});
        assertEquals("Result: 729.0", out.toString().trim());
    }
    
    @Test
    public void bigNumberPlus() {
        Calculator.main(new String[]{ "3000000", "+", "6000000"});
        assertEquals("Result: 9000000.0", out.toString().trim());
    }
    
    @Test
    public void multiEquations() {
        Calculator.main(new String[]{ "3", "+", "6", "+", "9"});
        assertEquals("Result: 18.0", out.toString().trim());
    }
    
    @Test
    public void plusMinus() {
        Calculator.main(new String[]{ "3", "+", "6", "-", "9"});
        assertEquals("Result: 0.0", out.toString().trim());
    }
    
    @Test
    public void multiplyDivide() {
        Calculator.main(new String[]{ "3", "*", "3", "/", "9"});
        assertEquals("Result: 1.0", out.toString().trim());
    }
    
    @Test
    public void fourOperands() {
        Calculator.main(new String[]{ "1", "+", "1", "+", "2", "*", "5"});
        assertEquals("Result: 20.0", out.toString().trim());
    }
}
