
/**
 * Calculates a specific value, whom we refer to the square root of a number, when multiplied by itself, yields the number.
 * @author Wilson
 *
 */
public class Sqrt {		 
	double calculate(double number) {				
	 	Absolute abs = new Absolute();
        final double accuracy = 1.0e-15; // Use for relative error calculation
        double squareRoot = number; // Initialize to given number
        
        // Exit loop when target accuracy is obtained
        while (Math.abs(squareRoot - (number / squareRoot)) > (accuracy * squareRoot)) {
            squareRoot = (squareRoot + (number / squareRoot)) / 2.0;
        }	           
        
	    return squareRoot;
	}
}
