/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeffb
 */
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getCustomerInfo method, of class Customer.
     */
    @Test
    public void testGetCustomerInfo() {
        System.out.println("getCustomerInfo");
        Customer instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCustomerInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerInfo method, of class Customer.
     */
    @Test
    public void testSetCustomerInfo() {
        System.out.println("setCustomerInfo");
        ArrayList<String> customer = null;
        Customer instance = null;
        instance.setCustomerInfo(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
