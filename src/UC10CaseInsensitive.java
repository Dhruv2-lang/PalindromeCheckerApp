public class UC10CaseInsensitive {

    public static boolean isPalindromeIgnoreCaseAndSpace(String str) {

        // Normalize string
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "Madam In Eden Im Adam";

        boolean result = isPalindromeIgnoreCaseAndSpace(word);

        if (result)
            System.out.println("\"" + word + "\" is a palindrome.");
        else
            System.out.println("\"" + word + "\" is not a palindrome.");
    }
}