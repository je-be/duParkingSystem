package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PermitManagerTest {
    
    public PermitManagerTest() {
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

    @Test
//    Custom built test  to check if the methods in PermitManager are working

    public static void main( String[] args ) {
      ArrayList< String > parkingPermits = new ArrayList<>();
      // create Customer object for the Car object 
      Customer cust6 = new Customer ( "", "Asim", "", "", "" );
      // create Car object for ParkingPermit object
      Car kar1 = new Car( cust6, "123DEF", "SUV" );
      ParkingPermit p1 = new ParkingPermit( "S1001", kar1 );
      ArrayList< String > permitInfoOne = new ArrayList<>();
      permitInfoOne = p1.buildPermitArrayForRegistry( p1 );
      parkingPermits.addAll( permitInfoOne );
      
      // create Customer object for the Car object 
      Customer cust7 = new Customer ( "", "Rahim", "", "", "" );
      // create Car object for ParkingPermit object
      Car kar2 = new Car( cust7, "ABC123", "COMPACT" );
      ParkingPermit p2 = new ParkingPermit( "S1002", kar2 );
      ArrayList< String > permitInfoTwo = new ArrayList<>();
      permitInfoTwo = p2.buildPermitArrayForRegistry(  p2 );
      parkingPermits.addAll( permitInfoTwo );
    
      System.out.println( Arrays.asList( parkingPermits ) );
    }
    /**
     * Test of registerCarPermit method, of class PermitManager.
     * Autogenerated by NetBeans JUnit plugin.
     */
//    @Test
//    public void testRegisterCarPermit() {
//      System.out.println("registerCarPermit");
//      ArrayList<String> newPermitInfo = null;
//      PermitManager instance = new PermitManager();
//      ArrayList expResult = null;
//      ArrayList result = instance.registerCarPermit(newPermitInfo);
//      assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class PermitManager.
     * Autogenerated by NetBeans JUnit plugin.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        PermitManager.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}