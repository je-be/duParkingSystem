package jeffbernsen.universityparkingsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jeffb
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({jeffbernsen.universityparkingsystem.AddressTest.class, 
    jeffbernsen.universityparkingsystem.ParkingLotTest.class, 
    jeffbernsen.universityparkingsystem.ParkingOfficeTest.class, 
    jeffbernsen.universityparkingsystem.CustomerTest.class, 
    jeffbernsen.universityparkingsystem.CarTypeTest.class})

public class UniversityparkingsystemSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
