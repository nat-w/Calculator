public class Sin {
	public double calculate (double x)
	{
		/* variables for calculations
		 *  answer will contain the final answer
		 *  modifiedNumber is the value of the number (after some modification or not)
		 *  newNumber is used when calculating answer using the addition formula for sine
		 */
		double answer = 0, modifiedNumber, newNumber = 0;
		boolean neg = false;
			
		if (x == 0 || x == 180 || x == 360 || x == -180 || x == -360)
			return 0.0;
		else if (x == 90)
			return 1.0;
		else if (x == -90)
			return -1.0;
		else {
			// if number is negative, multiply by -1 to make it positive
			if (x < 0){
				neg = true;
				modifiedNumber = x * -1;
			}
			else
				modifiedNumber = x;
			
			while (modifiedNumber > 360) {
				modifiedNumber = modifiedNumber - 360;
			}
			
			if (modifiedNumber > 270) {
				newNumber = modifiedNumber - 270;
				answer = -1 * cos(newNumber);
			}
			else if (modifiedNumber > 180) {
				newNumber = modifiedNumber - 180;
				answer = -1 * sinF(newNumber);
			}
			else if (modifiedNumber > 90) {
				newNumber = modifiedNumber - 90;
				answer = 1 * cos(newNumber);
			}
			else {
				answer = sinF(modifiedNumber);
			}
			
			if (neg == true)
				return (answer * - 1);
			else
				return answer;
		}
	}
	
	public static double sinF (double num) {
		// change number to radians
		final double pi = 3.1415926535897932384626433832795;
		double rad = (num * pi) / 180;
		
		double result = rad;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				result += HelperFunctions.exponent(rad, 2 * i + 1) / HelperFunctions.factorial(2 * i + 1);
			else
				result -= HelperFunctions.exponent(rad, 2 * i + 1) / HelperFunctions.factorial(2 * i + 1);
		}

		return result;
	}
	
	public static double cos (double num) {
		// change number to radians
		final double pi = 3.1415926535897932384626433832795;
		double rad = (num * pi) / 180;
		
		double result = 1;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				result += HelperFunctions.exponent(rad,2 * i) / HelperFunctions.factorial(2 * i);
			else
				result -= HelperFunctions.exponent(rad,2 * i) / HelperFunctions.factorial(2 * i);
		}
		return result;
	}
}
