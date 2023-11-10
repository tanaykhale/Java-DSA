class leet1 {
    public int finalValueAfterOperations(String[] operations) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < operations.length; i++) {
            str.append(operations[i] + "+");
        }
        int a = Integer.parseInt(str);

    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations());
    }
}