public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call (move inward)
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "deified";   // Change string here

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input String : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}