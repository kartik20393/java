public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Length
        System.out.println("Length of str1: " + str1.length());

        // Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatStr);

        // Substring
        System.out.println("Substring: " + concatStr.substring(0, 5));
    }
}
