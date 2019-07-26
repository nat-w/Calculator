// calculates the log with base ten of a number x
import java.util.Scanner;

public class Log {

    // calculates log(x) using Taylor Series
    public double calculate (double x) {
        int n = 5; // how many iterations of Taylor Series

        if (x == 1)
            return 0.0;

        else if (x <= 0.0)
            return 0.0;

        return changeOfBase(TaylorSeriesLN(x, n)); // convert ln to log
    }

    // returns the taylor series for ln(x) with n iterations
    double TaylorSeriesLN(double x, int n) {
        double total = 0.0;
        for (int i = 1; i <= n; i++) {
            double numerator = HelperFunctions.exponent(x - 1.0, i);
            total += (numerator / i) * HelperFunctions.exponent(-1.0, (i + 1));
        }
        return total;
    }

    // returns log(x) given that x is ln(x)
    double changeOfBase(double x) {
        return x / 2.30259;
    }
}
