public class pra {
    public static void main(String args[]) {
        String str = "tanay";
        String es = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' &&
                    str.charAt(i) != 'u') {
                es = es + str.charAt(i);

            }

        }
        System.out.println(es);

    }
}
