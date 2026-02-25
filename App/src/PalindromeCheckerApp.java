import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "racecar";
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }

    }
}