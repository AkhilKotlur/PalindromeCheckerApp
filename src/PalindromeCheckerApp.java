public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Convert string to character array and compare characters
        String input = "deified";

        // Character Array (char[]) – Used to store individual characters for index-based access
        char[] charArray = input.toCharArray();

        // Two-Pointer Technique – One pointer at the start, one at the end
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Compare start & end characters
        while (start < end) {
            // Array Indexing – Accessing elements using index positions
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}