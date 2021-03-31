package jeffbernsen.universityparkingsystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ParkingTransaction {
  
  private LocalDateTime date;
  protected ParkingPermit permit;
  private ParkingLot dailyRate; 
  private double chargedAmount;
  private String carType;
  public ParkingLot parkingLot;
  
  public ParkingTransaction() {
    double chargedAmount = 0;
    LocalDateTime date = java.time.LocalDateTime.now();
    this.parkingLot = parkingLot;
  }
  
  public double getParkingLotDailyRate( ParkingLot parkingLot ) {
      return parkingLot.getDailyRate();
  }
  
  public String getIdPermit( ParkingPermit permit ) {
    return permit.getIdPermit();
  }
  
  public LocalDateTime getTransactionDate() {
    return date;
  }
  
  public double getChargedAmount( ParkingLot parkingLot, ParkingPermit permit ) {
    var rate = parkingLot.getDailyRate();
    var type = permit.getCarType();
    double chargedAmount;
    if ( "COMPACT".equals( type ) ) {
      chargedAmount = (rate * 0.8);
    } else {
      chargedAmount = rate;
    }
    return chargedAmount;
  }


  
}
