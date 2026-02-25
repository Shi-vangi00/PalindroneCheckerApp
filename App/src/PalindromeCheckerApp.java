import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "deified";

        Deque<Character> deque = new ArrayDeque<>();
        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);
        if (isPalindrome) {
            System.out.println("Result : It is a Deque-validated Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
        System.out.println(" Input: " + input);
        System.out.println(" Is Palindrome: " + isPalindrome);
    }
}
