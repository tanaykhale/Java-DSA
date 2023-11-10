// Print numbers from 1 to 5.
public class r2 {
    static void numbers(int num) {
        if (num == 6)
            return;
        System.out.println(num);
        numbers(num + 1);
    }

    public static void main(String[] args) {
        numbers(0);
    }
}
