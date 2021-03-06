public class HelperFunctions {

    // returns |x|
    public static double absoluteValue(double x) {
        return x >= 0.0 ? x : -x;
    }

    // returns x^n
    public static double exponent(double x, int n) {
        double result = 1.0;
        if (n == 0)
            return 1.0;

        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return  result;
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}