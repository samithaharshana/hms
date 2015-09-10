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
public class ReservationTest {
    
    public ReservationTest() {
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
     * Test of getarrivaldate method, of class Reservation.
     */
    @Test
    public void testGetarrivaldate() {
        System.out.println("getarrivaldate");
        
        String arrival="09/08/2015";
        Reservation instance = new Reservation();
        String expResult = "09/08/2015";
        String result = instance.getarrivaldate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getdeparturedate method, of class Reservation.
     */
    @Test
    public void testGetdeparturedate() {
        System.out.println("getdeparturedate");
       
          Reservation instance1 = new Reservation();
        String expResult = "09/08/2015";
        String result = instance1.getarrivaldate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of noOfDays method, of class Reservation.
     */
    @Test
    public void testNoOfDays1() {
        System.out.println("noOfDays");
        int month = 1;
        int year = 2015;
        Reservation instance = new Reservation();
        int expResult = 31;
        int result = instance.noOfDays(month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    
      @Test
    public void testNoOfDays2() {
        System.out.println("noOfDays");
        int month = 2;
        int year = 2015;
        Reservation instance = new Reservation();
        int expResult = 28;
        int result = instance.noOfDays(month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    /**
     * Test of main method, of class Reservation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Reservation.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of noOfDays method, of class Reservation.
     */
    @Test
    public void testNoOfDays() {
        System.out.println("noOfDays");
        int month = 1;   
        int year = 2015;
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.noOfDays(month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
