import java.util.Scanner;

import java.util.*;


/**
 * @author Divyluv Sharma
 *
 */

public class EPowerX {
	 
		// The exponential function will return the approximate value of e^x 
	// program logic : through the concept of Power series
	// computation of the first n terms of a Taylor Series 
        static double exponential(int n, double input)
		   { 
			// sum of series initialized to 1 
			double series_sum = 1.0;

			for (int i = n - 1; i > 0; --i ) 
                  //formula to calculate the sum of n terms in a series 
				
				series_sum = 1.0 + input * series_sum / i;

			return series_sum; 
		   } 
		
// driver program 
		
public static double calculate(double x) {

	/**int flag;
	System.out.println(" PICK ONE OF THE FOLLOWING OPTIONS");

	System.out.println(" 1. QUICK AND APPROXIMATE RESULT");
	System.out.println(" 2. SLOW BUT MORE ACCURATE RESULT");
	System.out.print("\n");
	flag = keyboardinput.nextInt();

	if(flag == 1)
		return exponential(25, x);
	
	else 
		if(flag == 2)
		{
			System.out.println("Enter the total number of terms for the taylor series "); 
			System.out.print("\n");
			System.out.println("greater the value of n, better the accuracy)");
			System.out.print("\n");
			 n = keyboardinput.nextInt();
			 n=n+2000;
			 
			return exponential(n, x);
		}
		else
			System.out.println("NICE TRY, BUT INVALID CHOICE"); 
	}
	 **/

	return exponential(25, x);
	}
}
