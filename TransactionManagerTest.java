package jeffbernsen.universityparkingsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionManagerTest {
    
    public TransactionManagerTest() {
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
     * Test of park method, of class TransactionManager.
     * Autogenerated by NetBeans JUnit plugin.
     */
    @Test
    public void testPark() {
        System.out.println("park");
        ParkingLot parkingLot = null;
        ParkingPermit permit = null;
        TransactionManager instance = new TransactionManager();
        ParkingTransaction expResult = null;
        ParkingTransaction result = instance.park(parkingLot, permit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParkingChargesByPermit method, of class TransactionManager.
     * Autogenerated by NetBeans JUnit plugin.
     */
    @Test
    public void testGetParkingChargesByPermit() {
        System.out.println("getParkingChargesByPermit");
        ParkingPermit idPermit = null;
        TransactionManager instance = new TransactionManager();
        double expResult = 0.0;
        double result = instance.getParkingChargesByPermit(idPermit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParkingChargesByCustomer method, of class TransactionManager.
     * Autogenerated by NetBeans JUnit plugin.
     */
    @Test
    public void testGetParkingChargesByCustomer() {
        System.out.println("getParkingChargesByCustomer");
        Customer owner = null;
        TransactionManager instance = new TransactionManager();
        double expResult = 0.0;
        double result = instance.getParkingChargesByCustomer(owner);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
