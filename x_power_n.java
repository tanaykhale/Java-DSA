public class x_power_n {
    public static int clac(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        int xPower1 = clac(x, n - 1);
        int xn = x * xPower1;
        return xn;
    }

    public static void main(String[] args) {
        int out = clac(2, 5);
        System.out.println(out);
    }
}
