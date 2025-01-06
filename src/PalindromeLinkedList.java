class ListNodePl {
        int val;
    ListNodePl next;

    ListNodePl(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public class PalindromeLinkedList {

        // Method to find the middle of the linked list
        public ListNodePl getMiddle(ListNodePl head) {
            ListNodePl fast = head;
            ListNodePl slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        // Method to reverse a linked list
        public ListNodePl reverse(ListNodePl head) {
            ListNodePl prev = null;
            ListNodePl curr = head;

            while (curr != null) {
                ListNodePl next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        // Method to check if a linked list is a palindrome
        public boolean isPalindrome(ListNodePl head) {
            if (head == null || head.next == null) {
                return true;
            }

            ListNodePl firstHalfEnd = getMiddle(head);
            ListNodePl secondHalfStart = reverse(firstHalfEnd.next);
            ListNodePl firstHalfStart = head;

            while (secondHalfStart != null) {
                if (secondHalfStart.val != firstHalfStart.val) {
                    return false;
                }
                secondHalfStart = secondHalfStart.next;
                firstHalfStart = firstHalfStart.next;
            }

            return true;
        }

        // Main method for testing
        public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 2 -> 1
            ListNodePl head = new ListNodePl(1);
            head.next = new ListNodePl(2);
            head.next.next = new ListNodePl(2);
            head.next.next.next = new ListNodePl(1);

            // Create an instance of PalindromeLinkedList
            PalindromeLinkedList pll = new PalindromeLinkedList();

            // Check if the linked list is a palindrome
            boolean result = pll.isPalindrome(head);

            // Print the result
            System.out.println("Is the linked list a palindrome? " + result);
        }
    }
