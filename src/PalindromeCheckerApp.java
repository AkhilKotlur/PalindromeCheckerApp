public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Display whether a hardcoded string is a palindrome

        // Hardcoded string literal stored in a String variable
        String word = "madam";
        String reversedWord = "madam"; // Hardcoded result for this UC

        // Flow: Program starts and hardcoded string is checked
        // Conditional Statement (if-else) used to evaluate the condition
        if (word.equals(reversedWord)) {
            // Console Output: System.out.println() used to display the result
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // Program exits
    }
}