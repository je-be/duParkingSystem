package jeffbernsen.universityparkingsystem;

import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionManager {
  
  public List< ParkingTransaction > transactions;
  public ArrayList< ParkingPermit > parkingPermits; 
  
  public TransactionManager() {
   // empty constructor
  }
  
  /** 
   * The parking transaction date is returned, a charge goes to the parking permit based 
   * on the parkingLotID.
     * @param parkingLot
     * @param permit
     * @return 
  **/
  public ParkingTransaction park( ParkingLot parkingLot, ParkingPermit permit ) {
    // create an parking event
    var parkEvent = new ParkingTransaction();
    transactions.add( parkEvent );
    return parkEvent;
  }
  
  // This returns the parking charges per each permit
  public double getParkingChargesByPermit( ParkingPermit idPermit ) {
    // search transactions List for all of the parking charges for a specific permit
    // initialize variable to store sum of charges
    double parkingChargesPerPermit = 0;
    ArrayList< Double > chargesList = new ArrayList<>();
    for( int i = 0; i < transactions.size(); i++) {
      if( transactions.get(i).permit.equals( idPermit ) ) {
        chargesList.add( transactions.get(i).getChargedAmount( transactions.get(i).parkingLot, 
                transactions.get(i).permit ));
      } 
    }    
    if ( chargesList.size() > 0 ) {
      double sumCharges = 0;
      for ( int i = 0; i < chargesList.size(); i++ ) {
        sumCharges = sumCharges + chargesList.get(i);
      } parkingChargesPerPermit = sumCharges;
    } else {
      parkingChargesPerPermit = 0;
    }
    return parkingChargesPerPermit;
  }
  
  public double getParkingChargesByCustomer( Customer owner ) {
    // sum of all monthly charges by Customer
    // initialize variable to store sum of charges
    double parkingChargesPerCustomer = 0;
    ArrayList< Double > customerChargesList = new ArrayList<>();
    for ( int i = 0; i < transactions.size(); i++ ) {
      if( transactions.get(i).permit.getCarOwner().equals(owner.toString()) ) {
        customerChargesList.add( transactions.get(i).getChargedAmount( transactions.get(i).parkingLot, 
                transactions.get(i).permit ) ); 
      }
    } 
    if ( customerChargesList.size() > 0 ) {
      double sumCharges = 0;
      for ( int i = 0; i < customerChargesList.size(); i++ ) {
        sumCharges = sumCharges + customerChargesList.get(i);
      } parkingChargesPerCustomer = sumCharges;
    } else {
      parkingChargesPerCustomer = 0;
    }
    return parkingChargesPerCustomer;
  }
  
  
}
