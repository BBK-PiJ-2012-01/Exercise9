/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class NameUtilsTest {
    
    public NameUtilsTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getInitials method, of class NameUtils.
     */
    @Test
    public void testGetInitials() {
        System.out.println("getInitials");
        NameUtils instance = new NameUtils();
        String fullName, expResult, result;
        
        fullName = "Samuel James Wright";
        expResult = "SJW";
        result = instance.getInitials(fullName);
        assertEquals(expResult, result);
        
        
        fullName = "Samuel    James Wright";
        expResult = "SJW";
        result = instance.getInitials(fullName);
        assertEquals(expResult, result);
    }
}
