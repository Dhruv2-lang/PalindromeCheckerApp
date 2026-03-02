import java.util.Stack;

public class UC13PerformanceComparison {

    // Two Pointer
    public static boolean twoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Stack
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    // Recursion
    public static boolean recursive(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madaminedenimadam";

        // Two Pointer
        long start1 = System.nanoTime();
        twoPointer(word);
        long end1 = System.nanoTime();

        // Stack
        long start2 = System.nanoTime();
        stackMethod(word);
        long end2 = System.nanoTime();

        // Recursion
        long start3 = System.nanoTime();
        recursive(word, 0, word.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Time: " + (end2 - start2) + " ns");
        System.out.println("Recursion Time: " + (end3 - start3) + " ns");
    }
}