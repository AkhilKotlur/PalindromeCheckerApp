import java.util.*;

// 1. Define PalindromeStrategy interface
interface PalindromeStrategy {
    boolean check(String text);
}

// 2. Implement StackStrategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return clean.equals(reversed.toString());
    }
}

// 2. Implement DequeStrategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char c : clean.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// Context class to inject strategy at runtime
class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String text) {
        return strategy.check(text);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String input = "Racecar";

        // Inject StackStrategy at runtime
        checker.setStrategy(new StackStrategy());
        System.out.println("Using Stack: " + checker.validate(input));

        // Inject DequeStrategy at runtime
        checker.setStrategy(new DequeStrategy());
        System.out.println("Using Deque: " + checker.validate(input));
    }
}