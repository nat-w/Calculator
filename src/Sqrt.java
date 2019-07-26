
/**
 * Calculates a specific value, whom we refer to the square root of a number, when multiplied by itself, yields the number.
 * @author Wilson
 *
 */
public class Sqrt {		 
	double calculate(double x) {
        final double accuracy = 1.0e-15; // Use for relative error calculation
        double squareRoot = x; // Initialize to given number
        
        // Exit loop when target accuracy is obtained
        while (HelperFunctions.absoluteValue(squareRoot - (x / squareRoot)) > (accuracy * squareRoot)) {
            squareRoot = (squareRoot + (x / squareRoot)) / 2.0;
        }
	    return squareRoot;
	}
}
