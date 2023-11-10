public class hackerrank {
    static void Message(StringBuilder str) {
        String arr[] = new String[5];
        int start = 0;
        int end = 8;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.substring(start, end);
            start = end;
            end += 8;
        }
        int key = Integer.parseInt("10101010", 2);
        int newarr[] = new int[5];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = key ^ Integer.parseInt(arr[i], 2);
        }

        char res[] = new char[5];
        for (int i = 0; i < res.length; i++) {
            res[i] = (char) (newarr[i]);
        }

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(res[i]);
        }

    }

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("1110001011001111110001101100011011000101");
        Message(str);

    }
}