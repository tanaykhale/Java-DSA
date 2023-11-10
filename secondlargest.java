import java.util.Scanner;

class secondlargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxelementindex = arr.length - 1;
        int maxelementinarray = arr[maxelementindex];
        int i = 4;
        while (i > 1) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i - 1]);
                if (arr[i - 1] != arr[i - 2])
                    System.out.println(arr[i - 2]);
                break;
            } else {
                i--;
            }
        }
        if (i <= 1) {
            System.out.println("NOt Found!");
        }

    }
}