import javax.swing.*;

/** 
 * This class is used to demonstrate the functionality of the MetricConverter
 * class.
 */

class Demo {
    
    public static void main (String[] args) {

        MetricConverter converter = new MetricConverter( );
        
        double inputInches;
        double centimeters, inches;

        //Get input
        inputInches = getInput("Enter inches: ");

        //Perform various conversion routines
        centimeters = converter.inchesToCentimeters( inputInches );
        inches = converter.centimetersToInches( centimeters );
        
        //Display the result
        JOptionPane.showMessageDialog(null,
                                     "Input: " + inputInches + 
                                      " inches is equivalent to " +
                                      centimeters   + " centimeters");
        JOptionPane.showMessageDialog(null,
                                      "Converting back to inches: " + inches);

        double inputFeetAsString     = getInput("Enter Feet: ");

        String [] intArray = String.valueOf(inputFeetAsString).split("\\.");


        double inputFeetByFeet = Double.parseDouble(intArray[0]);
        double inputFeetByInches = 0;

        if (intArray.length > 1) {
             inputFeetByInches = Double.parseDouble(intArray[1]);
        }

        double feetToCentimeters = converter.feetAndInchesToCentimeters(inputFeetByFeet, inputFeetByInches);

        JOptionPane.showMessageDialog(null, "Input: " + inputFeetAsString +
                " feet is equivalent to " + feetToCentimeters + ".");
            
    }

    private static double getInput(String message) {
        String inputAsString;
        double input = 0;

        do {
            inputAsString = JOptionPane.showInputDialog(null,
                    message);
            input = Double.parseDouble(inputAsString);
            if(input <= 0) {
                JOptionPane.showMessageDialog(null, "Error: " + input +
                        " should be a positve value " + ".");
            }
        } while (input <= 0);

        return input;
    }

}
