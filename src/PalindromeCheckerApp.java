import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Goal: Demonstrate FIFO vs LIFO using Queue and Stack
        String input = "level";

        // Queue – Follows First In First Out (FIFO) principle
        Queue<Character> queue = new LinkedList<>();
        // Stack – Follows Last In First Out (LIFO) principle
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);  // Enqueue operation
            stack.push(c); // Push operation
        }

        boolean isPalindrome = true;

        // Logical Comparison: Matching dequeue (queue) with pop (stack)
        while (!stack.isEmpty()) {
            // Dequeue (removes from front) vs Pop (removes from top/end)
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}