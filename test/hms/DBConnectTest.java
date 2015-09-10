/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
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
public class DBConnectTest {
    
    public DBConnectTest() {
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
     * Test of DBConnect_1 method, of class DBConnect.
     */
    @Test
    public void testDBConnect_1() {
        System.out.println("DBConnect_1");
        DBConnect instance = new DBConnect();
        Connection expResult = null;
        Connection result = instance.DBConnect_1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class DBConnect.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection expResult = null;
        Connection result = DBConnect.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
      @Test
    public void testDBconnection() {
        System.out.println("validate_login");
         
       String username = "lal";
        String password= "551b45c5a2e3acc57690b0469d26f1a3";
        String type="Reseptionist";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.validate_login(username, password,type);
        assertEquals(expResult, result);
        
    }
    
      
}
