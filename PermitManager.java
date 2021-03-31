package jeffbernsen.universityparkingsystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class PermitManager {
  
  public ArrayList< ParkingPermit > parkingPermits;
 
  public PermitManager() {

  }
  
  public ArrayList< Object > buildPermitArrayForRegistry( ParkingPermit parkingPermit ) {
    String regArrElement0 = parkingPermit.getIdPermit();
    Customer regArrElement1 = parkingPermit.getCarOwner();
    String regArrElement2 = parkingPermit.getCarType();
    Date regArrElement3 = parkingPermit.getExpiration();
    ArrayList< Object > registryEntry = new ArrayList<>();
    Collections.addAll( registryEntry, regArrElement0, regArrElement1, regArrElement2, 
            regArrElement3 );
    return registryEntry;
  }
    
  public void registerCarPermit( ParkingPermit newPermitInfo ) {
    parkingPermits.add( newPermitInfo );
  }
  
  public String getPermitOfOwner( Customer owner ) {
    // iterate through parkingPermit, find permits where owner equals the value passed as parameter
    String permitOfOwner = "";
    for ( ParkingPermit parkingPermit : parkingPermits ) {
      if ( parkingPermit.getCarOwner().equals( owner.toString() ) ) {
        permitOfOwner = parkingPermit.getIdPermit();
      } 
    } return permitOfOwner;
  }
  
  public static void main( String[] args ) {
    // build a Customer object to construct the Car object
    Customer cust1 = new Customer ( "", "Simon", "", "", "" );
    // build a Car object to construct the parkingPermit;
    Car car001 = new Car ( cust1, "123ABC", "COMPACT");
    ParkingPermit permit1 =  new ParkingPermit( "P0003", car001 );
    
  }
}
