public class mergesort {
    public static void main(String[] args) {
        int arr1[] = { 1, 3 };
        int arr2[] = { 2 };
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];
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
        for (int m = 0; m < arr3.length; m++) {
            System.out.println(arr3[m]);
        }
    }
}
