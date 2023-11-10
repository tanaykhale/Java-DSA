public class disarium_number {
    public static void main(String[] args) {
        int num = 175;
        String s = Integer.toString(num);
        double size = s.length();
        double rem = 0, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + Math.pow(rem, size);
            num = num / 10;
            size--;
        }
        System.out.println(sum);
    }
}
