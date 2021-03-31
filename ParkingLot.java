
package jeffbernsen.universityparkingsystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ParkingLot {
  
  protected final String parkingLotName;
  protected Address parkingLotAddress;
  protected int parkingLotID;
  protected double dailyRate;
  protected List< Object > parkingLotList;
    
  public ParkingLot( String parkingLotName, int parkingLotID ) {
    this.parkingLotName = parkingLotName;
    this.parkingLotID = parkingLotID;
  }

    ParkingLot() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
  protected String getParkingLotName() {
    return parkingLotName;
  }
  
  public void setParkingLotAddress( Address parkingLotAddress ) {
    this.parkingLotAddress = parkingLotAddress;
  }
  
  public Address getParkingLotAddress() {
    return parkingLotAddress;
  }
  
  private int getParkingLotID() {
    return parkingLotID;
  }
  
  public double setParkingLotRate( double dailyRate ) {
    this.dailyRate = dailyRate;
    return dailyRate;
  }
    
  protected double getDailyRate() {
    return dailyRate;
  }

  public ArrayList< Object > buildParkingLotListInputs( ParkingLot parkingLotName ) {
    String element0 = parkingLotName.getParkingLotName();
    Address element1 = parkingLotName.getParkingLotAddress();
    int element2 = parkingLotName.getParkingLotID();
    double element3 = parkingLotName.getDailyRate();
    ArrayList< Object > lot = new ArrayList<>();
    Collections.addAll( lot, element0, element1, element2, element3 );
    return lot;
  }
    
  public void getParkingLotList() {
    for ( Object parkingLot : parkingLotList ) {
      System.out.println( Arrays.asList( parkingLot ) );
    }
  }
  
}
