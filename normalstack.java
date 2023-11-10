import java.util.Stack;

public class normalstack {
    public static void main(String[] args) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        Stack<Character> st = new Stack<>();
        String s = "(1+(2*3)+((8)/4))+1";
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
                count++;
            }
            if (c == ')') {
                st.pop();
                count = st.size();
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);

    }
}
