// calculates the log with base ten of a number x
import java.util.Scanner;

public class Log extends Equation {

    public Log() {
        System.out.println("Enter the value for x: ");
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();

        try {
            System.out.println("Log(x) = " + calculate(x));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    // calculates log(x) using Taylor Series
    double calculate(double x) throws Exception {
        int n = 10; // how many iterations of Taylor Series
        return changeOfBase(TaylorSeriesLN(x, n));
    }

    // returns the taylor series for ln(x) with n iterations
    double TaylorSeriesLN(double x, int n) {
        double total = 0.0;
        for (int i = 0; i < n; i++) {
            double sign = HelperFunctions.exponent(-1.0, n + 1);
            double numerator = HelperFunctions.exponent(x - 1.0, n);
            total += (numerator / n) * sign;
        }
        return total;
    }

    // returns log(x) given that x is ln(x)
    double changeOfBase(double x) {
        return x / 0.4342944819;
    }

}
