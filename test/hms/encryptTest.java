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
public class encryptTest {
    
    public encryptTest() {
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
     * Test of MD5 method, of class encrypt.
     */
    
    //pass he test
    @Test
    public void testMD5() {
        System.out.println("MD5");
        String str = "sam";
        String expResult = "332532dcfaa1cbf61e2a266bd723612c";
        String result = encrypt.MD5(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

       @Test
    public void testMD5_4() {
        System.out.println("MD5");
        String str = "samare";
        String expResult = "8acfaad69d5c09a12450c83f0d57e223";
        String result = encrypt.MD5(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

       @Test
    public void testMD5_5() {
        System.out.println("MD5");
        String str = "salman";
        String expResult = "03346657feea0490a4d4f677faa0583d";
        String result = encrypt.MD5(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

       @Test
    public void testMD5_6() {
        System.out.println("MD5");
        String str = "pusa";
        String expResult = "2e33bc25e7d8e08704d2a9498b974868";
        String result = encrypt.MD5(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

       @Test
    public void testMD5_7() {
        System.out.println("MD5");
        String str = "bandara";
        String expResult = "332532dcfaa1cbf61e2a266bd723612c";
        String result = encrypt.MD5(str);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
       @Test
    public void testMD5_8() {
        System.out.println("MD5");
        String str = "bandara";
        String expResult = "wertghnmklfvbnm,l";
        String result = encrypt.MD5(str);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
       @Test
    public void testMD5_9() {
        System.out.println("MD5");
        String str = "bandara";
        String expResult = "gayyaaaaaaaaaaaaaaaaaaaaaaa";
        String result = encrypt.MD5(str);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testMD5_1() {
        System.out.println("MD5");
        String str = "123";
        String expResult = "202cb962ac59075b964b07152d234b70";
        String result = encrypt.MD5(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    //fail test
    
    @Test
    public void testMD5_2() {
        System.out.println("MD5");
        String str = "123";
        String expResult = "202cb962ac59075b";
        String result = encrypt.MD5(str);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
        
    @Test
    public void testMD5_3() {
        System.out.println("MD5");
        String str = "3467";
        String expResult = "202cb962ac59075b";
        String result = encrypt.MD5(str);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of main method, of class encrypt.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        encrypt.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
