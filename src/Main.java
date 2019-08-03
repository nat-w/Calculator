// This is the driver that handles the UI, user input,
// and calling the corresponding functions

import java.util.Scanner;

public class Main {		
	private static final Scanner in = new Scanner(System.in);
	private static boolean quit = false;
	
    public static void main(String[] args) {
        // greeting message
        displayGreeting();

        do {
            // calculator main menu
            displayMenu();
            int choice = getChoice(1, 6);

            double x = 0.0;
            double[] inputArr = new double[25];

            if (choice == 5)
                inputArr = getInputArray();
            else if (choice != 6)
                x = getInput();


            // Direct to equation corresponding to user input choice
            switch (choice) {
                case 1:
                    sin sin = new sin();
                    System.out.println("Sin(" + x + ") = " + sin.calculate(x));
                    break;
                case 2:
                    power power = new power();
                    System.out.println("10^" + x + " = " + power.calculate(x));
                    break;
                case 3:
                    Log log = new Log();
                    System.out.println("Log(" + x + ") = " + log.calculate(x));
                    break;
                case 4:
                    EPowerX e = new EPowerX();
                    System.out.println("E^" + x + " = " + e.calculate(x));
                    break;
                case 5:
                    StandardDeviation stdev = new StandardDeviation();
                    System.out.println("Standard deviation = " + stdev.calculate(inputArr));
                    break;
                default:
                    // end the program
                    quit = true;
                    displayClosing();
                    break;
            }
        } while (!quit);
        in.close();
    }

    // displays greeting upon running the program
    static void displayGreeting() {
        System.out.println("Hello, this is a calculator for transcendental functions.");
    }

    // displays closing message before ending the program
    static void displayClosing() {
        System.out.println("Program ended. Goodbye.");
    }

    // displays the main menu of the calculator
    static void displayMenu() {
        System.out.println("\nEquations to choose from: " +
                "\n1. Sin(x)" +
                "\n2. 10^x" +
                "\n3. log(x) (base 10)" +
                "\n4. e^x" +
                "\n5. Standard deviation" +
                "\n6. Quit and close program." +
                "\nEnter the number of the equation you wish to use: ");
    }

    // returns the integer for the equation the user chooses
    static int getChoice(int start, int end) {                	
        int choice = in.nextInt();
        
        if (choice < start || choice > end) {        		        		
        	System.out.println("Invalid choice, try again."); 
        	getChoice(start, end);	
        }        	        
        
        return choice;                      
    }

    // prompts user for input
    static double getInput() {
        System.out.print("\nPlease enter the value for x in the chosen equation: ");
        double x = in.nextDouble();
        return x;
    }

    static double[] getInputArray() {
        System.out.print("\nPlease enter a series of numbers delimited by ',' (e.g. 1,2,3,4,5): ");
        String input;

        input = in.next();

        String[] arrSplit = input.split(",");
        double[] values = new double[arrSplit.length];

        for (int i = 0; i < arrSplit.length; i++)
            values[i] = Double.parseDouble(arrSplit[i]);

        return values;
    }
}
