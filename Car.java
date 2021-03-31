package jeffbernsen.universityparkingsystem;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Car {
  
  private String licensePlate;
  private Customer owner;
  private String type;
  private List< Car > car;
  
  protected Car ( Customer owner, String licensePlate, String type) {
    this.owner = owner;
    this.licensePlate = licensePlate;
    this.type = type;
  }
  
  public void setType( String type ) {
      // type should be set to match enum CarType values of Compact or SUV
      this.type = type; 
  }
  
  public String getType() {
      return type;
  }

  public void setOwner( Customer owner ) {
    // input the customer id 
    this.owner = owner;
  }
  
  public Customer getOwner() {
    return owner;    
  }
  
  public void setLicensePlate( String plate ) {
      this.licensePlate = plate;
  }
  
  public String getLicensePlate() {
    return licensePlate;
  }
  

}