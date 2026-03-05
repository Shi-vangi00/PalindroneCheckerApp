public class PalindromeCheckerApp {

    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        return isPalindrome(normalized, 0, normalized.length() - 1);
    }
    private boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}