package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ParkingPermit {
  
  private String idPermit;
  private Car car;
  private Date expiration;
  private ParkingPermit parkingPermit;
    
  public ParkingPermit( String idPermit, Car car ) {
    this.idPermit = idPermit;
    this.car = car;
  }
  
  public void setIdPermit( String idPermit) {
    this.idPermit = idPermit;
  }
  
  public String getIdPermit( ) {
    return idPermit;
  }
  
  public String getCarType( ) {
    return car.getType();
  }
  
  public Customer getCarOwner() {
    return car.getOwner();
  }
  
  public void setExpiration ( String inputExpDate ) {
    Date expDate = DateUtility.parseDate( inputExpDate );
    this.expiration = expDate;
  }
  
  public Date getExpiration () {
    return expiration;
  }

  public ArrayList buildPermitArrayForRegistry( ParkingPermit parkingPermit ) {
    String regArrElement0 = parkingPermit.getIdPermit();
    Customer regArrElement1 = parkingPermit.getCarOwner();
    String regArrElement2 = parkingPermit.getCarType();
    Date regArrElement3 = parkingPermit.getExpiration();
    ArrayList< Object > registryEntry = new ArrayList<>();
    Collections.addAll( registryEntry, regArrElement0, regArrElement1, regArrElement2, 
            regArrElement3 );
    return registryEntry;
  }
  
}
