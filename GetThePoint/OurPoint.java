/**
 * This class provides various routines to
 * manipulate points in the coordinate plane (x, y).
 */

public class OurPoint { // Object

//----------------------------------
//    Data Members
//----------------------------------
  
  /**
   * The x coordinate of a point
   */
    private double xCoord; // a class variable
   
  /**
   * The y coordinate of a point
   */
    private double yCoord; // a class variable

//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public OurPoint( ) {
       xCoord = 0;
       yCoord = 0;
   }


   public OurPoint(double xInit, double yInit ) { // constructor method
       double xCoord =0, yCoord = 0; //  method variables, declaration
       this.xCoord = xInit; // initialization
       this.yCoord = yInit;


       System.out.println("Class/field variable x " + this.xCoord);
       System.out.println("Class/field variable y " + this.yCoord);

       System.out.println("\n" );
       System.out.println("Method/local variable x " + xCoord);
       System.out.println("Method/local variable y " + yCoord);
       System.out.println("\n" );

   }

   
//-------------------------------------------------
//      Public Methods:
// 
//          void setX  ( double );
//          void setY  ( double );
//          double getX ( double );
//          double getY ( double );
//------------------------------------------------
   
   /**
    * Changes the value of the x-coordinate of a point
    * 
    * 
    * @param x the new value for the x-coordinate of this point
    */
   public void setX (double x) {
       xCoord = x;
   }

   /**
    * Changes the value of the y-coordinate of a point
    * 
    * @param y the new value for the x-coordinate of this point
    */
   public void setY (double y) {
       this.yCoord = y;
   }

   /**
    * Returns the x-coordinate of a point
    * 
    * @return the x-coordinate of this point
    */
   public double getX () {
       return xCoord;
   }

   /**
    * Returns the y-coordinate of a point
    * 
    * @return the y-coordinate of this point
    */
   public double getY () {
       return this.yCoord;
   }
    

    // main method used to test the OurPoint class
    //-----------------------------------------------------


   public static void main (String [] args)  {
      OurPoint q  = new OurPoint (-7, 4); // Coordinates of q are (-5, 12)
      System.out.println("The x-coordinate of q is " + q.getX()); // expect: The x-coordinate of q is -7
      System.out.println("The y-coordinate of q is " + q.getY()); // expect: The y-coordinate of q is 4

   }


}
