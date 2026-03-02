/**
 * Node class representing each element in the Singly Linked List
 */
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Test Input
        String input = "malayalam";

        // 1. Convert string to linked list
        Node head = createLinkedList(input);

        // 2. Check for palindrome
        if (isPalindrome(head)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    /**
     * Logic to determine if the linked list is a palindrome
     */
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step A: Use Fast and Slow Pointers to find the middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step B: Reverse the second half of the list starting from 'slow'
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // Step C: Compare the two halves
        Node tempSecond = secondHalf;
        boolean result = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // (Optional) Step D: Restore the list by reversing back
        reverseList(secondHalf);

        return result;
    }

    /**
     * Helper method to reverse a Singly Linked List
     */
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    /**
     * Helper method to build a linked list from a String
     */
    private static Node createLinkedList(String s) {
        if (s.isEmpty()) return null;
        Node head = new Node(s.charAt(0));
        Node current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new Node(s.charAt(i));
            current = current.next;
        }
        return head;
    }
}