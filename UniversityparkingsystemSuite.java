/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Suite.SuiteClasses({jeffbernsen.universityparkingsystem.AddressTest.class, jeffbernsen.universityparkingsystem.ParkingLotsTest.class, jeffbernsen.universityparkingsystem.MoneyTest.class, jeffbernsen.universityparkingsystem.ParkingOfficeTest.class, jeffbernsen.universityparkingsystem.CustomerTest.class, jeffbernsen.universityparkingsystem.CarTypeTest.class})
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
