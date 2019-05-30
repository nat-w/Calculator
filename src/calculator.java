// Java Program to find Power of a Number - 10^x
import java.util.Scanner;

public class calculator {
	private static Scanner kb;
	public static void main(String[] args) 
	{
		int base=10;
		int p, exponent;
		long power = 1;
		kb = new Scanner(System.in);
		
		System.out.println("_________________________________________________________");
		System.out.println("                Function: 10^x                           ");
		System.out.println("_________________________________________________________");
		System.out.print(" Please Enter the Exponent Value : ");
		exponent = kb.nextInt();	
		
		for(p = 1; p <= exponent; p++)
		{
			power = power * base;
		}
		System.out.println("\n The result of " + base + " power " + exponent + " = " + power);
	}
}



