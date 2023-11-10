import java.util.*;

public class list1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            arr.add(sc.next());
        }
        for (int i = 0; i < 4; i++) {
            String s = (String) arr.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e'
                        || s.charAt(j) == 'i' || s.charAt(j) == 'o'
                        || s.charAt(j) == 'u' || s.charAt(j) == 'A'
                        || s.charAt(j) == 'E' || s.charAt(j) == 'I'
                        || s.charAt(j) == 'O'
                        || s.charAt(j) == 'U') {

                    arr.remove(j);
                    break;
                } else {
                    arr.add(s);
                }
            }
        }
        System.out.println(arr);
    }
}