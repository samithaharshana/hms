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
public class LOGINTest {
    
    public LOGINTest() {
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
     * Test of main method, of class LOGIN.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LOGIN.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    //pass test casses
     @Test
    public void testlogin1() {
        System.out.println("login");
         
       String username = "sam";
        String password= "332532dcfaa1cbf61e2a266bd723612c";
        String type="Administrator";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testlogin2() {
        System.out.println("login");
         
       String username = "namal";
        String password= "499fd2f4db04db9927c7152593d11a1e";
        String type="Staff";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertEquals(expResult, result);
        
    }
    
    
     @Test
    public void testlogin3() {
        System.out.println("login");
         
       String username = "lal";
        String password= "551b45c5a2e3acc57690b0469d26f1a3";
        String type="Reseptionist";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertEquals(expResult, result);
        
    }
    
    //failtest cases
      @Test
     public void testlogin4() {
        System.out.println("login");
         
       String username = "sam";
        String password= "332532dcfaa1cbf61e2a266bd7";
        String type="Administrator";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertNotSame(expResult, result);
        
    }
     //failtest cases
      @Test
     public void testlogin5() {
        System.out.println("login");
         
       String username = "pusa";
        String password= "332532dcfaa1cbf61e2a266bd7";
        String type="Administrator";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertNotSame(expResult, result);
        
    }
     
          //failtest cases
      @Test
     public void testlogin6() {
        System.out.println("login");
         
       String username = "Dasun";
        String password= "332532dcfaa1cbf61e2a266bd7";
        String type="Administrator";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertNotSame(expResult, result);
        
    }
}
