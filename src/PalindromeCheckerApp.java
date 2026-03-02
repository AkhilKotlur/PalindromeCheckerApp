import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Use Deque to compare front and rear elements
        String input = "noon";

        // Deque (Double Ended Queue) – Allows insertion and deletion from both ends
        Deque<Character> deque = new ArrayDeque<>();

        // Flow: 1. Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Flow: 2. Remove first & last and 3. Compare until empty
        // Front and Rear Access – Enables direct comparison of first and last characters
        while (deque.size() > 1) {
            Character first = deque.removeFirst();
            Character last = deque.removeLast();

            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}