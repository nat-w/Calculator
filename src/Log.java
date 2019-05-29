// calculates the log with base ten of a number x
public class Log extends Equation {

    // constants to help in calculation
    private final double log1 = 0.0;
    private final double log2 = 0.30103;
    private final double log3 = 0.47712;
    private final double log5 = 0.69897;
    private final double log7 = 0.84510;

    // calculates log(x)
    float calculate(double x) {
        int numTens = 0;
        int result = 0;
        int[] factors = {1, 1, 1, 1};

        // because log 10 = 1, divide x to simplify equation
        // product rule of logarithms
        while (x > 10) {
            x %= 10;
            numTens++;
        }

        // round off x to get int y, higher error introduced
        int y = round(x);

        // factor out y
        for (int i = 0; y <= 1;) {
            if (y % 2 == 0) {
                y /= 2;
                factors[i] = 2;
                i++;
            }
            else if (y % 3 == 0) {
                y /= 3;
                factors[i] = 3;
                i++;
            }
            else if (y % 5 == 0) {
                y /= 5;
                factors[i] = 5;
                i++;
            }
            else if (y % 7 == 0) {
                y /= 7;
                factors[i] = 7;
                i++;
            }
        }

        // add up the log of factors using constants
        for (int i = 0; i < factors.length; i++) {
            result += logConstant(factors[i]);
        }

        // log 10 = 1, so add the multiples of ten
        result += numTens;

        return result;
    }

    // helper function for rounding
    private int round(double x) {
        x += 0.5;
        return (int)x;
    }

    private double logConstant(int x) {
        switch (x) {
            case 1:
                return log1;
            case 2:
                return log2;
            case 3:
                return log3;
            case 5:
                return log5;
            case 7:
                return log7;
            default:
                return 0.0;
        }
    }


}
