import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Use stack to reverse characters and validate palindrome
        String input = "racecar";

        // Stack – A linear data structure that follows the LIFO principle
        Stack<Character> stack = new Stack<>();

        // Push Operation – Used to insert characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        // Pop Operation – Used to remove characters from the stack in reverse order
        // Reversal Logic – Stack naturally reverses the order of elements
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare and print result
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}