import java.util.Scanner;

class BinarySearch {
    int calculate(int arr[], int key) {
        int low = 0;
        int high = (arr.length) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch obj = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int result = obj.calculate(arr, key);
        if (result != -1) {
            System.out.println("Key is at index " + result);
        }
    }
}