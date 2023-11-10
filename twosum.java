public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };

                }
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };
        int t = 3;
        int[] x = new int[2];
        x = twoSum(a, t);
        System.out.println(x[0] + " , " + x[1]);

    }
}