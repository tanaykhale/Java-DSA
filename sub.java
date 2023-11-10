public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}

public class sub {
    public static int zoho(int[] nums) {
        Pair<Integer, Boolean> a = new Pair<>(-1, false);
        Pair<Integer, Boolean> b = new Pair<>(-1, false);
        Pair<Integer, Boolean> c = new Pair<>(-1, false);

        for (int num : nums) {
            if ((a.getSecond() && a.getFirst() == num) ||
                    (b.getSecond() && b.getFirst() == num) ||
                    (c.getSecond() && c.getFirst() == num)) {
                continue;
            }

            if (!a.getSecond() || a.getFirst() <= num) {
                c = b;
                b = a;
                a = new Pair<>(num, true);
            } else if (!b.getSecond() || b.getFirst() <= num) {
                c = b;
                b = new Pair<>(num, true);
            } else if (!c.getSecond() || c.getFirst() <= num) {
                c = new Pair<>(num, true);
            }
        }

        if (!c.getSecond()) {
            return a.getFirst();
        }

        return c.getFirst();
    }

    public static int zoho(String str, String str2) {
        int num = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str.indexOf(str2.charAt(i)) != -1) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 3, 1 };
        int ans = zoho(arr);
        System.out.println(ans);
    }
}
