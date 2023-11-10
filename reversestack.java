import java.util.Scanner;
import java.util.Stack;

public class reversestack {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        for (int i = 0; i < st.length(); i++)
            s.push(st.charAt(i));

        // for (int j = s.size(); j >= 0; j--) {
        // System.out.println(s.lastElement() - j);
        // }
        System.out.println(s.lastElement());
    }
}
