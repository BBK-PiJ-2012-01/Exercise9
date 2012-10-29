/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import BBK.PiJ01.common.IOGeneric;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class AccountingTest {
    
    public AccountingTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of main method, of class Accounting.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        
        IOGeneric.addDebugStringLine("Gas");
        IOGeneric.addDebugStringLine("50");
        IOGeneric.addDebugStringLine("Electricity");
        IOGeneric.addDebugStringLine("70");
        IOGeneric.addDebugStringLine("END");
        
        IOGeneric.captureOutput();
        Accounting.main();
        String result = IOGeneric.popCapturedOutput();
        
        IOGeneric.emptyDebugStrings();
        
        String expected = "You have " + 2 + " bills unpaid (total debt: " + (50+70) + ")";
        assertEquals(expected, result);
    }
}
