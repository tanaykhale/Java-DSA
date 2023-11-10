public class fib_using_recursion {
    public static void fib(int size, int firstElement, int secondElement) {

        if (size == 0) {
            return;
        }
        System.out.println(firstElement);
        fib(size - 1, secondElement, firstElement + secondElement);
    }

    public static void main(String[] args) {
        fib(8, 0, 1);
    }

}
