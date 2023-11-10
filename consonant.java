import java.util.Scanner;

public class consonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                count = 0;
            } else
                count++;
        }
        if (count >= 4)
            System.out.println("Yes");
        else
            System.out.println("no");

    }
}
