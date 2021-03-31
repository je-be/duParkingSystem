package jeffbernsen.universityparkingsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is a class that allows use of a date entry method in other classes without having to 
 * rewrite the parsing and date functions in each class. 
 */

public class DateUtility {

  public static Date parseDate( String date ) {
    try {
      return new SimpleDateFormat( "yyyy-MM-dd" ).parse( date );
    } catch ( ParseException e ) {
      return null;
    }
  }
  
}
