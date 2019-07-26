// Java Program to find Power of a Number - 10^x
import java.util.Scanner;

public class Power {
	public static double calculate(double x)
	{
		int base = 10;
		int exponent = (int)x;
		int power = 1;

		for(int i = 1; i <= exponent; i++)
		{
			power = power * base;
		}
		return power;
	}
}



