import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "radar";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            stack.push(c);   // Adds to the top (LIFO)
            queue.add(c);    // Adds to the back (FIFO)
        }

        while (!stack.isEmpty()) {
            char fromStack = stack.pop();    // Last character first
            char fromQueue = queue.remove(); // First character first

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
