import java.util.Scanner;

public class Sin {
	public static void main(String[] args)
	{
		//System.out.println("Choose the number for an equation: \n 1. sin(x) 2. 10^x 3. log10 x 4. e^x 5. standard deviation");
		
		System.out.println("Choose a number :");
		
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		
		System.out.println("sin(" + number + ") = " + sin(number));

	}
	
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num-1);
	}
	
	public static double exp(double num, double expon) {
		double result = 1;
		
		for(int i = 1; i <= expon; i++)
			result = result * num;
		
		return result;	
	}
	
	public static double sin(double num) {
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

}
