package common;

import calculator.Calculator;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Syme
 */
public class TestCommon {
    
    protected final ByteArrayOutputStream out = new ByteArrayOutputStream();

    public TestCommon() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(out));
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
    }
}
