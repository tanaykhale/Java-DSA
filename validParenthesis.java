import java.util.Stack;

public class validParenthesis {
    public static boolean isMatching(char a, char b) {
        return ((a == '(' && b == ')') ||
                (a == '[' && b == ']') ||
                (a == '{' && b == '}')

        );
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack();
        boolean res = false;
        String str = "(){[]}";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty())
                    res = false;
                else if (isMatching(s.peek(), ch)) {
                    res = true;
                } else
                    s.pop();
            }
        }
        if (s.isEmpty())
            res = true;
        System.out.println(res);
    }
}
