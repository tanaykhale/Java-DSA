public class leethard {
    public static double findMedianSortedArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;

        int arr3[] = new int[l1 + l2];
        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            if (arr2[j] < arr1[i])
                arr3[k++] = arr2[j++];

        }

        while (i < l1) {
            arr3[k++] = arr1[i++];

        }
        while (j < l2) {
            arr3[k++] = arr2[j++];
        }
        int n = arr3.length;
        if (n % 2 == 0) {
            int mid1 = arr3[n / 2];
            int mid2 = arr3[(n / 2) - 1];
            return (double) ((arr3[mid1] + arr3[mid2]) / 2);
        } else {
            int mid = arr3[n / 2];
            return (double) (mid);
        }
    }

    public static void main(String[] args) {
        int num1[] = { 1, 3 };
        int num2[] = { 2 };
        double a = findMedianSortedArray(num1, num2);
        System.out.println(a);
    }
}
