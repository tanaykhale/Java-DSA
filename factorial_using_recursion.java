public class factorial_using_recursion {
    public static int fact(int num) {
        if (num == 0)
            return 1;
        else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        int s=fact(n);
        System.out.println(s);
    }
}
