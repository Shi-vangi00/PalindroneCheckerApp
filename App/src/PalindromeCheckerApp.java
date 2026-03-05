import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    public PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        PalindromeStrategy strategy = new StackStrategy();

        PalindromeCheckerApp checker = new PalindromeCheckerApp(strategy);

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}