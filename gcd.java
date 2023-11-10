class gdc {
    public static void main(String[] args) {
        int a = 50, b = 60;
        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(b);
    }
}