// Q1. Print numbers from 5 to 1.
public class r1 {
    static void numbers(int num) {
        if (num == 0)
            return;
        System.out.println(num);
        numbers(num - 1);

    }

    public static void main(String[] args) {
        numbers(5);

    }
}