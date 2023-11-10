class fib {
    public static void main(String[] args) {
        int a = 0;
        int b = 1, c;
        int num = 5;
        while (num != 0) {
            c = a + b;
            a = b;
            b = c;
            num--;
            System.out.println(c);
        }
    }
}