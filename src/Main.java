// This is the driver that handles the UI, user input,
// and calling the corresponding functions

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // greeting message
        System.out.println(displayGreeting());

        // calculator main menu
        System.out.println(displayMenu());
        int equation = getChoice(1, 5);

        // get the number to calculate
        System.out.println(displayXMessage());
        double x = getX();

        // TODO: create Equation instance and calculate

        // end the program
        System.out.println(displayClosing());
        
        //Test function five
        //testFunctionFive();
    }

    // displays greeting upon running the program
    static String displayGreeting() {
        return "Hello, this is a calculator for transcendental functions.";
    }

    // displays closing message before ending the program
    static String displayClosing() {
        return "Program ended. Goodbye.";
    }

    // displays the main menu of the calculator
    static String displayMenu() {
        return  "\nEquations to choose from: " +
                "\n1. sin(x)" +
                "\n2. 10^x" +
                "\n3. log(x) (base 10)" +
                "\n4. e^x" +
                "\n5. sqrt(x)" +
                "\nEnter the number of the equation you wish to use: ";
    }

    static String displayXMessage() {
        return "Choose the number to calculate in the chosen equation. x = ";
    }

    // returns the integer for the equation the user chooses
    static int getChoice(int start, int end) {
        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();

        if (choice < start || choice > end) {
            System.out.println("Invalid choice, try again.");
            getChoice(start, end);
        }
        in.close();
        return choice;
    }

    static double getX() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        in.close();
        return x;
    }
    
    static void testFunctionFive() {
    	StandardDeviation stdev = new StandardDeviation();
		double[] values = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
		System.out.println("Standard deviation: " + stdev.compute(values));
                
        double x = 10.0;
        Sqrt sqrt = new Sqrt();
        try {
			System.out.println("Square root of " + x + " is approximately " + sqrt.calculate(x));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
