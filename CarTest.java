
package jeffbernsen.universityparkingsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarTest {
    
    public CarTest() {
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
    // Custom built test  to check if the methods in Car class are working
    public static void main( String[] args ) {
      // build Customer object for the construction of the Car object
      Customer cust2 = new Customer ( "", "Kim", "", "", "" );
      Car carOne = new Car( cust2, "123ABC", "SUV" );
      System.out.println( "The license plate of the car is " + carOne.getLicensePlate() );
      System.out.println( "The owner of the car is " + carOne.getOwner() );
      System.out.println( "The type of the car is a " + carOne.getType() );
      carOne.setLicensePlate( " 123DEF " );
      cust2.firstName = "Jim";
      carOne.setOwner( cust2 );
      carOne.setType( "COMPACT" );
      System.out.println( "CORRECTION: The license plate of the car is " + carOne.getLicensePlate() );
      System.out.println( "CORRECTION: The owner of the car is " + carOne.getOwner() );
      System.out.println( "CORRECTION: The type of the car is a " + carOne.getType() );
  }

    /**
     * Test of setType method, of class Car.
     * Autogenerated by NetBeans JUnit plugin.
     */
//    @Test
//    public void testSetType() {
//        System.out.println("setType");
//        String type = "";
//        Car instance = null;
//        instance.setType(type);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getType method, of class Car.
     * Autogenerated by NetBeans JUnit.
     */
//    @Test
//    public void testGetType() {
//        System.out.println("getType");
//        Car instance = null;
//        String expResult = "";
//        String result = instance.getType();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setOwner method, of class Car.
     * Autogenerated by NetBeans JUnit.
     */
//    @Test
//    public void testSetOwner() {
//        System.out.println("setOwner");
//        String owner = "";
//        Car instance = null;
//        instance.setOwner(owner);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getOwner method, of class Car.
     * Autogenerated by NetBeans JUnit.
     */
//    @Test
//    public void testGetOwner() {
//        System.out.println("getOwner");
//        Car instance = null;
//        String expResult = "";
//        String result = instance.getOwner();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setLicensePlate method, of class Car.
     * Autogenerated by NetBeans JUnit.
     */
//    @Test
//    public void testSetLicensePlate() {
//        System.out.println("setLicensePlate");
//        String plate = "";
//        Car instance = null;
//        instance.setLicensePlate(plate);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getLicensePlate method, of class Car.
     * Autogenerated by NetBeans JUnit.
     */
//    @Test
//    public void testGetLicensePlate() {
//        System.out.println("getLicensePlate");
//        Car instance = null;
//        String expResult = "";
//        String result = instance.getLicensePlate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}