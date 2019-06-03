import java.util.Scanner;

/**
 * Calculates the standard deviation of values within a given data set
 * @author Wilson
 *
 */
public class StandardDeviation {
	public void compute() {
			
        // Prompt user for input
		double[] values = requestInput();	
		
		Absolute abs = new Absolute();
		Sqrt sqrt = new Sqrt();
			
		double sum = 0.0;
		double size = values.length;	
			
		//Calculate mean
		double mean = computeMean(values);
			
		for (int i = 0; i < size; i++) {			
			sum += abs.compute(values[i] - mean) * abs.compute(values[i] - mean); // Compute square of absolute difference
		}						
				
		double result = sqrt.calculate(sum / size);
		
		// Display result
		System.out.println("Standard deviation: " + result);
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
	
    // prompts user for input
    static double[] requestInput() {
    	System.out.print("\nPlease enter a series of numbers delimited by ',' (e.g. 1,2,3,4,5): ");    	
    	String input;    	
    	
    	Scanner scanner = new Scanner(System.in);
   		input = scanner.next();    		
   		scanner.close();  
    	
   		String[] arrSplit = input.split(",");
   		double[] values = new double[arrSplit.length]; 
   		
    	for (int i = 0; i < arrSplit.length; i++)
    		values[i] = Double.parseDouble(arrSplit[i]);
    	
    	return values;
    }
}
