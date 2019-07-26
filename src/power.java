// Java Program to find Power of a Number - 10^x
import java.util.Scanner;

public class Power {
	public static void main(String[] args){
	Scanner kb = new Scanner(System.in);
	{
		int base=10;
		int exponent=1;
		
		kb = new Scanner(System.in);
		
		System.out.println("_________________________________________________________");
		System.out.println("                Function: 10^x                           ");
		System.out.println("_________________________________________________________");
		System.out.print(" Please Enter the Exponent Value : ");
		exponent = kb.nextInt();
		
		double result = computepower(base, exponent);
		System.out.println(base+ " to the power of "+ exponent +" = "+ result +".");
		}
	}
	
	private static double computepower(int base, int exponent) {
		 double result = 1;
		    if(exponent==0)// base case
		       return 1;
		    
		    if(exponent>0){
		         for(int i = 0;i<exponent;i++)
		         { 
		              result *= base;
		         }
		    }
		    else
		    {
		      for(int i = exponent;i<0;i++)
		         {  
		              result *= base;
		         }
		           result = 1/result;
		    }
		    return result;
		}
}
