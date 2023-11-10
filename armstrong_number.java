import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toString(num);
        int size = s.length();
        double rem;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            rem = num % 10;

            sum = sum + Math.pow(rem, size);
            num = num / 10;
        }
        System.out.println(sum);
    }
}
