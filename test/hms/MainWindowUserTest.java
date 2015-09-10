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
public class MainWindowUserTest {
    
    public MainWindowUserTest() {
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
     * Test of setname method, of class MainWindowUser.
     */
    @Test
    public void testSetname() {

        
        System.out.println("setname");
        String username = "sam";
        MainWindowReception instance = new MainWindowReception();
        instance.setname(username);
         String expResult="sam";
        String result=instance.setname(username);
            assertEquals(expResult, result);
    }
    
    
        @Test
    public void testSetname1() {

        
        System.out.println("setname");
        String username = "sam";
        MainWindowReception instance = new MainWindowReception();
        instance.setname(username);
         String expResult="sammm";
        String result=instance.setname(username);
            assertNotSame(expResult, result);
    }

    /**
     * Test of Checkintable_load method, of class MainWindowUser.
     */
    @Test
    public void testCheckintable_load() throws Exception {
        System.out.println("Checkintable_load");
        MainWindowUser instance = new MainWindowUser();
        instance.Checkintable_load();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Reservationtable_load method, of class MainWindowUser.
     */
    @Test
    public void testReservationtable_load() throws Exception {
        System.out.println("Reservationtable_load");
        MainWindowUser instance = new MainWindowUser();
        instance.Reservationtable_load();
        // TODO review the generated test code  and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainWindowUser.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        MainWindowUser.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
