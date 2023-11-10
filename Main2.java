public class Main2 {

    public static void main(String[] args) {
        String str = "JV GLOBAL";
        char ch = 'L';
        long startTime, endTime, elapsedTime;
        startTime = System.nanoTime();
        String resultBuffer = removeCharacterWithStringBuffer(str, ch);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Using StringBuffer: " + resultBuffer);
        System.out.println("Time taken: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        String resultBuilder = removeCharacterWithStringBuilder(str, ch);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Using StringBuilder: " + resultBuilder);
        System.out.println("Time taken: " + elapsedTime + " ns");
    }

    public static String removeCharacterWithStringBuffer(String input, char ch) {
        StringBuffer buffer = new StringBuffer(input);
        for (int i = 0; i < buffer.length();) {
            if (buffer.charAt(i) == ch) {
                buffer.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return buffer.toString();
    }

    public static String removeCharacterWithStringBuilder(String input, char ch) {
        StringBuilder builder = new StringBuilder(input);
        for (int i = 0; i < builder.length();) {
            if (builder.charAt(i) == ch) {
                builder.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return builder.toString();
    }
}