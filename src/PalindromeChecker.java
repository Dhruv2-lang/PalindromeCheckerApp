public class PalindromeChecker {

    private String input;

    // Constructor
    public PalindromeChecker(String input) {
        this.input = input;
    }

    // Public method exposed to user
    public boolean checkPalindrome() {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}