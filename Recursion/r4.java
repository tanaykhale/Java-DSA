//Q6. Print x^n (with stack height = n)
public class r4 {
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
