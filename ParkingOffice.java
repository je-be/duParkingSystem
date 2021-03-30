package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingOffice {
    
  private final String parkingOfficeName = "Denver University Parking Office";
  public List< Customer > listOfCustomers;
  public List< ParkingLots > listOfParkingLots;
  private final Address parkingOfficeAddress;
  protected List< ParkingLots > parkingLots;

  public ParkingOffice( Address parkingOfficeAddress ) {
      this.parkingOfficeAddress = parkingOfficeAddress;
  }
  
  public String getParkingOfficeName() {
      return parkingOfficeName;
  }
  
  private void register( Customer customer ) {
      listOfCustomers.add(customer);
  }
}
