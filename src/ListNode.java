import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {
        // If there are fewer than two nodes, return the list as is
        if (head == null || head.next == null) {
            return head;
        }

        // Pointers to the two nodes to swap
        ListNode first = head;
        ListNode second = head.next;

        // Swap the first pair
        first.next = swapPairs(second.next);
        second.next = first;

        // Return the new head (second node)
        return second;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        // Swap pairs
        head = swapPairs(head);

        System.out.println("Swapped List:");
        printList(head);
    }
}
}