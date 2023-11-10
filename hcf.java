public class hcf {
    public static int hcf(int a, int b) {
        if (a % b == 0)
            return b;
        else {
            return hcf(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 70;
        int b = 15;
        int res = hcf(a, b);
        System.out.println(res);
    }
}
