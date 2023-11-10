import java.util.*;

class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ori_num = num;
        int rem = 0;
        int rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        System.out.println(rev);
        int diff = rev - ori_num;
        System.out.println(diff);
        Stack<Integer> s = new Stack<Integer>();
        // for (int i = 2; i < num; i++) {
        // if (num % i == 0) {
        // s.push(i);
        // }
        // }
        // int i = 1;

        // while (i < diff) {
        // int n = 2;
        // int store = diff / i;
        // if (store % n == 0) {
        // s.push(i);
        // diff = store;
        // } else if (store % n != 0) {
        // i++;
        // n++;
        // } else
        // break;
        // }
        int i = 1;
        while (i < num) {
            if (num % i == 0)
                s.push(i);
            i++;
        }
        System.out.println(s);
    }
}