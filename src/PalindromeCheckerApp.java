/**
 * Service class that encapsulates palindrome logic.
 * Demonstrates Encapsulation and the Single Responsibility Principle.
 */
class PalindromeService {

    /**
     * Checks if a string is a palindrome.
     * Logic: Compares characters from both ends using the Two-Pointer technique.
     */
    public boolean checkPalindrome(String text) {
        if (text == null) return false;

        // Data Structure: Internal (Array-based access)
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = cleanText.length() - 1;

        while (start < end) {
            if (cleanText.charAt(start) != cleanText.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Encapsulate palindrome logic in a class
        PalindromeService service = new PalindromeService();

        String testInput = "Was it a car or a cat I saw";

        // Expose checkPalindrome() method
        boolean result = service.checkPalindrome(testInput);

        if (result) {
            System.out.println("\"" + testInput + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testInput + "\" is not a palindrome.");
        }
    }
}