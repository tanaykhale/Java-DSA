import java.util.Scanner;

class ar {

    public static void yesorno() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {

            yesorno();
            test--;
        }
    }
}