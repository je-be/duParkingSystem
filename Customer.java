
package jeffbernsen.universityparkingsystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {

  protected String id;
  protected String firstName;
  protected String lastName;
  protected String phoneNumber;
  protected String addressID;
  protected ArrayList< String > customer;
  
  public Customer( String id, String firstName, String lastName, String phoneNumber,
          String addressID) {
    customer = new ArrayList<>();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.addressID = addressID;
    customer.add(0, id);
    customer.add(1, firstName);
    customer.add(2, lastName);
    customer.add(3, phoneNumber);
    customer.add(4, addressID);
  }
  
  public ArrayList< String > getCustomerInfo() {
      return customer;
  }
  
  public void setCustomerInfo( ArrayList< String > customer) {
      this.customer = customer;
  }
  
/* stub test for Customer methods

  public static void main( String[] args ) {
    var customerOne = new Customer( "1001", "Mr", "President", "800-NO-COVID", "WhiteHouse" );
    var customerToPrint = customerOne.getCustomerInfo();    
    System.out.println( customerToPrint );      
  }
*/
  
}