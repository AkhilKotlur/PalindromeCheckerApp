public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Check whether a string is a palindrome by reversing it

        String original = "radar";
        String reversed = "";

        // Loop (for loop) – Used to iterate through the characters of the string in reverse order
        // String Concatenation (+) – Used to build the reversed string character by character
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // equals() Method – Used to compare the actual content of two String objects
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}