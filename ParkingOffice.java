package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingOffice extends TransactionManager {
    
  private final String parkingOfficeName; ;
  public List< Customer > listOfCustomers;
  private final Address parkingOfficeAddress;
  private final List< Object > listOfParkingLots;
  private final List< Object > listOfCars;
  public ArrayList< ParkingPermit > parkingPermits;

  public ParkingOffice( Address parkingOfficeAddress ) {
    this.parkingOfficeAddress = parkingOfficeAddress;
    parkingOfficeName = "Denver University Parking Office";
    listOfParkingLots = new ArrayList<>();
    listOfCars = new ArrayList<>();
  }

  /**
   * may not be necessary to getParkingOfficeName() if
   * the call is to ParkingOffice.parkingOfficeName
   * this getter is available if needed
   */
  public String getParkingOfficeName() {
    return parkingOfficeName;
  }
       
  protected void registerCustomer( Customer customer ) {
    listOfCustomers.add( customer );
  }
  
  protected ParkingPermit registerCar( String idPermit, Car car ) {
    ParkingPermit permitToRegister = new ParkingPermit( idPermit, car );
    parkingPermits.add( permitToRegister );
    System.out.println( car.getOwner() + " registered " + car.getLicensePlate() + 
            " and issued permit number " + idPermit + "");
    return permitToRegister;
  }
  
  /**
   * extends TransactionManager method Park
   * it is possible to call park() method from TransactionManager instead of calling parkEvent()
   */
  private ParkingTransaction parkEvent( ParkingLot parkingLot, ParkingPermit permit ) {
    ParkingTransaction newParkEvent = new ParkingTransaction();
    newParkEvent = park( parkingLot, permit );
    return newParkEvent;
  }
      
  protected double chargesByPermit( ParkingPermit idPermit ) {
    return getParkingChargesByPermit( idPermit );
  }
  
  protected double chargesByCustomer ( Customer owner ) {
    return getParkingChargesByCustomer( owner );
  }
  
}
