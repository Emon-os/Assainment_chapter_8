package Exercise_17;

public class Numeric {
    public static double intPower(double x, int n) {
        if (n < 0) {
            return 1 / intPower(x, -n);
        } else if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double temp = intPower(x, n / 2);
            return temp * temp;
        } else {
            return x * intPower(x, n - 1);
        }
    }

    public static void main(String[] args) {
        double result = intPower(2.0, 5);
        System.out.println(result);  // Output should be 32.0
    }
}

