public class UC9Recursive {

    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";   // change this to test

        boolean result = isPalindromeRecursive(word, 0, word.length() - 1);

        if (result)
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is not a palindrome.");
    }
}