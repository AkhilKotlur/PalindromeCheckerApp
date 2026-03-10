import java.util.Scanner;

public class



PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- UC13: Palindrome Performance Comparison ---");
        System.out.print("Enter a string to test: ");
        String input = scanner.nextLine();

        // 1. Run Multiple Algorithms and 2. Capture execution time

        // Approach 1: Iterative (Two Pointers)
        long startIterative = System.nanoTime(); //
        boolean isPalindromeIterative = checkIterative(input);
        long endIterative = System.nanoTime();
        long durationIterative = endIterative - startIterative;

        // Approach 2: String Reversal
        long startReversal = System.nanoTime();
        boolean isPalindromeReversal = checkReversal(input);
        long endReversal = System.nanoTime();
        long durationReversal = endReversal - startReversal;

        // 3. Display Results
        System.out.println("\nResults:");
        System.out.println("Iterative Approach: " + (isPalindromeIterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Execution Time (Iterative): " + durationIterative + " nanoseconds");

        System.out.println("\nReversal Approach: " + (isPalindromeReversal ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Execution Time (Reversal): " + durationReversal + " nanoseconds");

        scanner.close();
    }

    // Iterative approach using two pointers
    public static boolean checkIterative(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach using StringBuilder reversal
    public static boolean checkReversal(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversed);
    }
}