/**
 * Calculates the standard deviation of values within a given data set
 * @author Wilson
 *
 */
public class StandardDeviation {
	public double compute(double[] values) {
		
		try {
			Exponential exp = new Exponential();
			Absolute abs = new Absolute();
			Sqrt sqrt = new Sqrt();
			
			double sum = 0.0;
			double size = values.length;	
			
			//Calculate mean
			double mean = computeMean(values);
			
			for (int i = 0; i < size; i++) {				
				sum += exp.compute(abs.compute(values[i] - mean), 2);
			}						
						
			return sqrt.calculate(sum / size);			
		} catch (Exception e) { 
			e.printStackTrace();
			return 1;
		}			
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
