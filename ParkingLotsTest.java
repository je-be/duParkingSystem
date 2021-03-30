/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffbernsen.universityparkingsystem;

import java.util.List;
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
public class ParkingLotsTest {
    
    public ParkingLotsTest() {
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
     * Test of setParkingLot method, of class ParkingLots.
     */
    @Test
    public void testSetParkingLot() {
        System.out.println("setParkingLot");
        List<ParkingLots> parkingLots = null;
        ParkingLots instance = null;
        instance.setParkingLot(parkingLots);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRate method, of class ParkingLots.
     */
    @Test
    public void testGetDailyRate() {
        System.out.println("getDailyRate");
        String CarType = "";
        ParkingLots instance = null;
        double expResult = 0.0;
        double result = instance.getDailyRate(CarType);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
