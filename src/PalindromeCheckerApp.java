public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();

        // 1. Measure Performance of Two-Pointer Approach
        long start1 = System.nanoTime(); // Key Concept: System.nanoTime()
        isPalindromeTwoPointer(input);
        long end1 = System.nanoTime();
        System.out.println("Two-Pointer Approach Time: " + (end1 - start1) + " ns");

        // 2. Measure Performance of String Reversal Approach
        long start2 = System.nanoTime();
        isPalindromeReversal(input);
        long end2 = System.nanoTime();
        System.out.println("String Reversal Approach Time: " + (end2 - start2) + " ns");

        // Algorithm comparison
    }

    public static boolean isPalindromeTwoPointer(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        return true;
    }

    public static boolean isPalindromeReversal(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}