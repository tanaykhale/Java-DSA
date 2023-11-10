// Print the fibonacci sequence till nth term.
public class Fibonacci {
    static void calculate(int a, int b, int n) {
        if (n == 0) {

            return;
        }
        System.out.println(a);
        calculate(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        calculate(0, 1, 8);
    }
}
