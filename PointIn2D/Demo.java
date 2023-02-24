/** 
 * This class is used to demonstrate the functionality of the MetricConverter
 * class.
 */

/**
 * @author Tevin
 */
class Demo {
   public static void main (String [] args)  {
      OurPoint q  = new OurPoint (-5,-12); // Coordinates of q are (-5, 12)

      System.out.println ("The x coordinate of q is: " + q.getX());


      // Does not compile due to access modifier private
//      System.out.println ("The x coordinate of q is: " + q.xCoord);


   }

}
