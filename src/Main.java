// This is the driver that handles the UI, user input,
// and calling the corresponding functions

import java.util.Scanner;

public class Main {		
	private static final Scanner in = new Scanner(System.in);	
	
    public static void main(String[] args) {
        // greeting message
        System.out.println(displayGreeting());

        // calculator main menu
        System.out.println(displayMenu());
        int choice = getChoice(1, 5);
                
        // Direct to equation corresponding to user input choice
        EquationTypes equation = EquationTypes.valueOf(choice);        
        switch (equation) {
	        case SIN_OF_X:
	        	sin sin = new sin();
	        	sin.main(args);
	        	break;
	        case EXPONENT_BASE_10:
	        	power power = new power();
	        	power.main(args);	        	
	        	break;
	        case LOG_OF_X:
	        	Log log = new Log();
	        	//System.out.println("log(x)");
	        	break;
	        case NATURAL_EXPONENTIAL_FUNCTION:
	        	e_powx_calc e = new e_powx_calc();
	        	e.main(args);
	        	break;
	        case STANDARD_DEVIATION:	      
	        	StandardDeviation stdev = new StandardDeviation();
	        	stdev.compute();	        	
	        	break;
        }
                
        // end the program
        System.out.println(displayClosing());              
        in.close();             
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
                "\n5. Standard deviation" +
                "\nEnter the number of the equation you wish to use: ";
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
}
