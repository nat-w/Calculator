/**
 * Raises the power of a given number
 * @author Wilson
 *
 */
public class Exponential {
	double compute(double base, double power) {
		double factor = 1;
		double sum = 1;		
		
		// Special case base^0 yields 1
		if (power == 0)
			return 1;
		
		// Special case base^1 yields value of base
		else if (power == 1)
			return base;
		
		// All other cases
		else {
			while (factor <= power) {
				sum *= base;
				factor++;	
			}			
			
			return sum;
		}
	}	
}
