
package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Address {

  protected String streetAddress1;
  protected String streetAddress2;
  protected String city;
  protected String state;
  protected String zipcode;
  protected String addressID;
  public ArrayList< String > address;
  
  // 
  public Address( String streetAddress1, String streetAddress2, String city, String state, String zipcode, String addressID ) {
      address = new ArrayList<>();
      this.streetAddress1 = streetAddress1;
      this.streetAddress2 = streetAddress1;
      this.city = city;
      this.state = state;
      this.zipcode = zipcode;
      this.addressID = addressID;
      address.add(0, streetAddress1);
      address.add(1, streetAddress2);
      address.add(2, city);
      address.add(3, state);
      address.add(4, zipcode);
      address.add(5, addressID);
  }

  public ArrayList< String > getAddress() {
      return address;
  }
  
  public void setAddress( ArrayList< String > address ) {
      this.address = address;
  }

  /*  ---stub test for Address methods---
  
  public static void main( String[] args ) {
    var addressOne = new Address( "1600 Penn Ave", "", "Washington", "D.C.", "20500", "WhiteHouse" );
    var addressToPrint = addressOne.getAddress();
    System.out.println( addressToPrint );
  
  
  }
  */
}