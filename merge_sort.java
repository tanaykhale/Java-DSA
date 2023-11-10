
public class merge_sort {
    public static void Divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        Divide(arr, si, mid);
        Divide(arr, mid + 1, ei);

        Conquer(arr, si, mid, ei);
    }

    public static void Conquer(int arr[], int si, int mid, int ei) {
        int mergedArray[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2])
                mergedArray[x++] = arr[idx1++];
            else
                mergedArray[x++] = arr[idx2++];
        }

        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            mergedArray[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        Divide(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
