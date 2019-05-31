
/**
 * Calculates a specific value, whom we refer to the square root of a number, when multiplied by itself, yields the number.
 * @author Wilson
 *
 */
public class Sqrt extends Equation {		 
	float calculate(double x) throws Exception {		   	
		Exponential exp = new Exponential();
		Absolute abs = new Absolute();
	    final double APPROXIMATION = 0.000001;	    
	    double lowerBound = 0;
	 	double upperBound = 0;	 
		
	    // Case where x is negative
	 	if (x < 0) {
	 		throw new Exception("The square root of " + x + " is undefined.");
	 	}
	 		
	 	// Case where x is 0: sqrt(0) = 0 
	 	else if (x == 0) {
	 		return (float) x;
	 	}
	 	
	 	// Case where x is positive and less than 1
	 	else if (x < 1) {
	 		lowerBound = 0;
	 		upperBound = 1;
	 	}
	 	
	 	// Case where x is 1: sqrt(1) = 1
	 	else if (x == 1) {
	 		return (float) x;
	 	}
	 	
	 	// All other cases
	 	else {
	 		lowerBound = 1;
	 		upperBound = x;
	 	}
	    
	 	// Calculate initial values of midpoint and squareMidpoint
	 	double midpoint = (lowerBound) / 2;
	    double squareMidpoint = exp.compute(midpoint, 2);

	    // Exit loop when values of squareMidpoint and x become close enough within approximation
	    while (abs.compute(squareMidpoint - x) >= APPROXIMATION) {
	    	
	    	// Assigns midpoint to upperBound if the squareMidpoint is greater than x, else assigns it to lowerBound       
	        if (squareMidpoint > x) {
	        	upperBound = midpoint;
	        } else {
	        	lowerBound = midpoint;
	        }
	        
	        // Update values of midpoint and squareMidpoint
	        midpoint = (lowerBound + upperBound) / 2;
	        squareMidpoint = exp.compute(midpoint, 2);
	    }
	    
	    return (float) midpoint;
	}		
}
