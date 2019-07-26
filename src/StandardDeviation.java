import java.util.Scanner;

/**
 * Calculates the standard deviation of values within a given data set
 * @author Wilson
 *
 */
public class StandardDeviation {
	public double calculate(double[] vals) {
			
        // Prompt user for input
		double[] values = vals;
		
		Sqrt sqrt = new Sqrt();
			
		double sum = 0.0;
		double size = values.length;	
			
		//Calculate mean
		double mean = computeMean(values);
			
		for (int i = 0; i < size; i++) {			
			sum += HelperFunctions.absoluteValue(values[i] - mean) * HelperFunctions.absoluteValue(values[i] - mean); // Compute square of absolute difference
		}						
				
		double result = sqrt.calculate(sum / size);
		
		return result;
	}
	
	// Calculates the mean of the given values
	private double computeMean(double[] values ) {
		double sum = 0.0;
		int size = values.length;
		
		for (int i = 0; i < size; i++) {
			sum += values[i];
		}			
		
		return sum / size;
	}
}
