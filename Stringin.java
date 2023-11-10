public class Stringin {
    public static String res(String str) {
        StringBuilder compstr = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            char c = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            while (count > 0) {
                compstr.append(c);
                count--;
            }
        }
        return compstr.toString();
    }

    public static void main(String[] args) {
        String str = "a3b5c2a2";
        String result = res(str);
        System.out.println(result);

    }
}
