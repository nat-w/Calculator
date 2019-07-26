import java.util.Scanner;

public class sin {
	public static void main(String[] args)
	{
		/* variables for calculations
		 *  answer will contain the final answer
		 *  RedNum is the value of the number (after some modification or not)
		 *  newNum is used when calculating answer using the addition formula for sine
		 */
		double answer = 0, RedNum, newNum = 0;
		boolean neg = false;
	
		//Prompt user for a number
		System.out.println("Enter a number (in degrees) : ");
		
		// Get entered value
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		
		scan.close(); 
			
		if(number == 0 || number == 180 || number == 360 || number == -180 || number == -360)
			System.out.println("sin(" + number + ") = 0");
		else if(number == 90)
			System.out.println("sin(" + number + ") = 1");
		else if(number == -90)
			System.out.println("sin(" + number + ") = -1");
		else{
			// if number is negative, multiply by -1 to make it positive
			if (number < 0){
				neg = true;
				RedNum = number * -1;
			}
			else
				RedNum = number;
			
			while(RedNum > 360){
				RedNum = RedNum - 360;
			}
			
			if(RedNum > 270){
				newNum = RedNum - 270;
				answer = -1*cos(newNum);
			}
			else if(RedNum > 180){
				newNum = RedNum - 180;
				answer = -1*sinF(newNum);
			}
			else if(RedNum > 90){
				newNum = RedNum - 90;
				answer = 1*cos(newNum);
			}
			else{
				answer = sinF(RedNum);
			}
			
			if(neg == true)
				System.out.println("sin(" + number + ") = " + (answer * - 1));
			else
				System.out.println("sin(" + number + ") = " + answer);
		}
		
	}
	
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}
	
	public static double exp(double num, double expon) {
		double result = 1;
		
		for(int i = 1; i <= expon; i++)
			result = result * num;
		
		return result;	
	}
	
	public static double sinF(double num) {
		// change number to radians
		final double pi = 3.1415926535897932384626433832795;
		double rad = (num * pi)/180;
		
		double result = rad;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) 
				result += exp(rad,2 * i + 1)/factorial(2 * i + 1);
			else
				result -= exp(rad,2 * i + 1)/factorial(2 * i + 1);		
		}

		return result;
	}
	
	public static double cos(double num) {
		// change number to radians
		final double pi = 3.1415926535897932384626433832795;
		double rad = (num * pi)/180;
		
		double result = 1;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) 
				result += exp(rad,2 * i)/factorial(2 * i);
			else
				result -= exp(rad,2 * i)/factorial(2 * i);		
		}

		return result;
	}

}
