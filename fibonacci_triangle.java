public class fibonacci_triangle {
    public static void main(String[] args) {
        int size = 5;
        int a = 0, b = 1, c;
        for (int i = 1; i <= size; i++) {
            a = 0;
            b = 1;
            System.out.print(b);
            for (int j = 1; j < i; j++) {
                c = a + b;
                System.out.print(c);
                a = b;
                b = c;
            }
            System.out.println();

        }
    }
}
