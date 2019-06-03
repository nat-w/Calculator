// calculates the log with base ten of a number x
public class Log extends Equation {

    // constants to help in calculation
    private final double log1 = 0.0;
    private final double log2 = 0.30103;
    private final double log3 = 0.47712;
    private final double log5 = 0.69897;
    private final double log7 = 0.84510;

    public Log() {}

    // calculates log(x)
    double calculate(double x) throws Exception {
        int numTens = 0;
        double result = 0;

        // special case log 0 = undefined
        if (x < 1.0)
            throw new Exception("Log (0) is undefined");

        // because log 10 = 1, divide x to simplify equation
        // product rule of logarithms
        while (x > 9.5) {
            x /= 10.0;
            numTens++;
        }

        // round off x to get int y, higher error introduced
        int y = round(x);

        // factor out y
        while (y > 2) {
            if (y % 2 == 0) {
                y /= 2;
                result += logConstant(2);
            }
            else if (y % 3 == 0) {
                y /= 3;
                result += logConstant(3);
            }
            else if (y % 5 == 0) {
                y /= 5;
                result += logConstant(5);
            }
            else if (y % 7 == 0) {
                y /= 7;
                result += logConstant(7);
            }
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
