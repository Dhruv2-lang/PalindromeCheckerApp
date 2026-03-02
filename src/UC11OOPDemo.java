public class UC11OOPDemo {

    public static void main(String[] args) {

        String word = "madam";

        // Create object
        PalindromeChecker checker = new PalindromeChecker(word);

        boolean result = checker.checkPalindrome();

        if (result)
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is not a palindrome.");
    }
}