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
        return TaylorSeriesLN(x, n);
    }

    // returns the taylor series for ln(x) with n iterations
    double TaylorSeriesLN(x, n) {
        double total = 0.0;
        for (int i = 0; i < n; i++) {
            int sign = exponent(-1.0, n + 1);
            int numerator = exponent(x - 1.0, n);
            total += (numerator / n) * sign;
        }
    }

    // returns log(x) given that x is ln(x)
    double changeOfBase(x) {
        return x / 0.4342944819;
    }

}
