/**
 * This class provides various routines to
 * convert metric measurements to U.S. units and
 * vice versa.
 */

class MetricConverter {

//----------------------------------
//    Data Members
//----------------------------------
  
  /**
   * A factor to convert inches to centimeters
   */
  private static final double INCHES_TO_CENTIMETERS = 2.54; // constant

  /**
   * A factor to convert centimeters to inches
   */
  private static final double CENTIMETERS_TO_INCHES = 1 / 2.54; // constant
   
  /**
   * A factor to convert feet to inches
   */
  private static final double FEET_TO_INCHES        = 12.0; // constant
   
//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public MetricConverter( ) {
       
   }
   
//-------------------------------------------------
//  Public Methods:
// 
//      double  inchesToCentimeters        ( double         ) 1
//      double  centimetersToInches        ( double         ) 2
//      double  feetAndInchesToCentimeters ( double, double ) 3
//------------------------------------------------


    /**
     * Converts a given length in centimeters to
     * equivalent Inches.
     *
     * @param centimeters
     * @return
     */
    public double centimetersToInches(double centimeters) {
       return centimeters * CENTIMETERS_TO_INCHES;
    }

    /**
    * Converts a given length in inches to
    * equivalent centimeters.
    * 
    * @param inches  the length expressed in inches
    * @return length expressed in centimeters
    */
   public double inchesToCentimeters( double inches ) {
      return inches * INCHES_TO_CENTIMETERS;
   }
   
   /**
    * Converts a given length in feet and inches to
    * equivalent centimeters.
    * 
    * @param feet   the feet portion of the length
    * @param inches the inch portion of the length
    * @return length expressed in centimeters
    */
   public double feetAndInchesToCentimeters(double feet, double inches) {
       return this.inchesToCentimeters(feetToInches(feet) + inches);
   }

    private static double feetToInches(double feet) {
        return feet * FEET_TO_INCHES;
    }
}
