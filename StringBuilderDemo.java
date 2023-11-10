public class StringBuilderDemo {
    public static void main(String[] args) {
        // Demonstration of append(), insert(), and reverse() methods
        StringBuilder sb = new StringBuilder("Hello");

        appendDemo(sb);
        insertDemo(sb);
        reverseDemo(sb);

        // Practical time complexity demonstration
        int n = 100000;
        measureStringBufferTime(n);
        measureStringBuilderTime(n);
    }

    static void appendDemo(StringBuilder sb) {
        sb.append(" World");
        System.out.println("After append(): " + sb);
    }

    static void insertDemo(StringBuilder sb) {
        sb.insert(5, " Beautiful");
        System.out.println("After insert(): " + sb);
    }

    static void reverseDemo(StringBuilder sb) {
        sb.reverse();
        System.out.println("After reverse(): " + sb);
    }

    static void measureStringBufferTime(int n) {
        long startTime = System.nanoTime();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("a");
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("StringBuffer time taken: " + duration + " nanoseconds");
    }

    static void measureStringBuilderTime(int n) {
        long startTime = System.nanoTime();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("a");
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("StringBuilder time taken: " + duration + " nanoseconds");
    }
}
