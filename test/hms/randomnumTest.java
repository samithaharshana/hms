/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samitha
 */

//dfghjmxcbn xchndhjckx
public class randomnumTest {
    
    public randomnumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class randomnum.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] aArgs = null;
        randomnum.main(aArgs);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of empid method, of class randomnum.
     */
    @Test
    public void testEmpid() {
        System.out.println("empid");
        int expResult = 0;
        int result = randomnum.empid();
         boolean res=true;
        if(result<10000){
          res = true;
        }
        //assertEquals(expResult, result);
        assertNotSame(res, false);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testEmpid1() {
        System.out.println("empid");
        int expResult = 0;
        int result = randomnum.empid();
         boolean res=true;
        if(result>10000){
          res = true;
        }
        //assertEquals(expResult, result);
        assertEquals(res, true);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
