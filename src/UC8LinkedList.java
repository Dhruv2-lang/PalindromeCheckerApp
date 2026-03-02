public class UC8LinkedList {

    static class ListNode {
        char data;
        ListNode next;

        ListNode(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindromeUsingLinkedList(String str) {

        if (str == null || str.length() == 0)
            return true;

        // Convert string to linked list
        ListNode head = new ListNode(str.charAt(0));
        ListNode current = head;

        for (int i = 1; i < str.length(); i++) {
            current.next = new ListNode(str.charAt(i));
            current = current.next;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare halves
        ListNode firstHalf = head;
        ListNode secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";  // change this to test

        boolean result = isPalindromeUsingLinkedList(word);

        if (result)
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is not a palindrome.");
    }
}