import java.util.*;

public class Password {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        String current = " ";
        String result = " ";
        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            current = " ";
            current = " " + arr[i] + arr[i - 1];
            int n = Integer.parseInt(current);
            if (n == 32) {
                result += " ";
            } else if ((n >= 65 && n < 90) || (n >= 97 && n < 99)) {
                result += (char) n;
            } else {
                if (i - 2 < 0)
                    break;
                current += arr[i - 2];
                n = Integer.parseInt(current);
                result += (char) n;
                i--;
            }
        }
        System.out.println(result);
    }
}
