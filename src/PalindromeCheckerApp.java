public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Ignore spaces and case while checking a palindrome
        String input = "A man a plan a canal Panama";

        // 1. Normalize string using String preprocessing and Regular expressions
        // removeAll("\\s+", "") removes all whitespace
        // toLowerCase() ensures case-insensitivity
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // 2. Apply previous logic (Two-Pointer Technique)
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}