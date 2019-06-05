package e_toThe_power_x_function;

import java.util.Scanner;

import java.util.*;


/**
 * @author Divyluv Sharma
 *
 */

public class e_powx_calc {
	 
		// The exponential function will return the approximate value of e^x 
	// program logic : through the concept of power series
	// computation of the first n terms of a Taylor Series 
        static float exponential(int n, float input) 
		   { 
			// sum of series initialized to 1 
			float series_sum = 1; 

			for (int i = n - 1; i > 0; --i ) 
                  //formula to calculate the sum of n terms in a series 
				
				series_sum = 1 + input * series_sum / i; 

			return series_sum; 
		   } 
		
// driver program 
		
public static void main(String[] args) {
	     // TODO Auto-generated method stub
	     Scanner keyboardinput = new Scanner(System.in);
	     int x,n;
	// take input from user using keyboard.
	     System.out.println("Welcome to function 4. ");
	     System.out.print("\n");
	     System.out.println("Here you will calculate the functions of type -------> e^x <------------ /n");
	     System.out.print("\n");
	     
	     
	System.out.println("Enter the value of X so that the calculator can return e^x function value ");
	System.out.print("\n");
	
	x = keyboardinput.nextInt();
	int flag;
	System.out.println(" PICK ONE OF THE FOLLOWING OPTIONS");
	
	System.out.println(" 1. QUICK AND APPROXIMATE RESULT");
	System.out.println(" 2. SLOW BUT MORE ACCURATE RESULT");
	System.out.print("\n");
	flag = keyboardinput.nextInt();
	
	if(flag == 1)
		System.out.println("e^x = "+exponential(25,x));
	
	else 
		if(flag == 2)
		{
			System.out.println("Enter the total number of terms for the taylor series "); 
			System.out.print("\n");
			System.out.println("greater the value of n, better the accuracy)");
			System.out.print("\n");
			 n = keyboardinput.nextInt();
			 n=n+2000;
			 
			System.out.println("e^x = "+exponential(n,x)); 
		}
		else
			System.out.println("NICE TRY, BUT INVALID CHOICE"); 
	}
}
