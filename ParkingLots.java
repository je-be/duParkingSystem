
package jeffbernsen.universityparkingsystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLots {
  
  private final String parkingLotName;
  private final Address parkingLotAddress;
  protected int parkingLotID;
  protected double dailyRate;
  private List< ParkingLots > parkingLots;
    
  public ParkingLots( String parkingLotName, Address parkingLotAddress, int parkingLotID) {
    this.parkingLotName = parkingLotName;
    this.parkingLotAddress = parkingLotAddress;
    this.parkingLotID = parkingLotID;
  }
  
  public void setParkingLot( List< ParkingLots > parkingLots ) {
    this.parkingLots = parkingLots;
  }
    
  private double setParkingLotRate(double dailyRate) {
    this.dailyRate = dailyRate;
    return dailyRate;
  }
    
  protected double getDailyRate( String CarType ) {
    if ( "COMPACT".equals(CarType) ) {
        return dailyRate * 0.8;
    } else {
        return dailyRate;
    }
  }
  
  /* Stub test to check if the methods in ParkingLots are working
  
  public static void main( String[] args ) {
    Address parkingLotOneAddress = new Address( "2100 East Wesley Avenue", "", "Denver", "CO", "", 
            "General Lot 119" );
    var parkingLotOne = new ParkingLots( "General Lot 119", parkingLotOneAddress, 1);
    parkingLotOne.setParkingLotRate(4.50);  
    double lotOneRateCompact = parkingLotOne.getDailyRate("COMPACT");
    double lotOneRateSUV = parkingLotOne.getDailyRate("SUV");
    System.out.println( "The daily rate for an SUV in parking lot 1 is " + lotOneRateSUV + ". " +
              "Compact cars get a 20% discount and pay the daily rate of " + lotOneRateCompact ); 
  }
  */
}
