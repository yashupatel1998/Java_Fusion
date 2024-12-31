class NthListNode{
    int val;
    NthListNode next;
    NthListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class DeleteNthNode{
    public static NthListNode removeNthFromEnd(NthListNode head, int n) {
        if (head.next == null) {
            return null;

        }
        // size
        int size = 0;
        NthListNode currt = head;
        while (currt != null) {
            currt = currt.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        // Previous
        int indexToSearch = size - n;
        NthListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args){
        NthListNode head = new NthListNode(1);
        head.next = new NthListNode(2);
        head.next.next = new NthListNode(3);
        head.next.next.next = new NthListNode(4);
        head.next.next.next.next = new NthListNode(5);

        //want to remove 2nd last node
        int n= 2;
        head = removeNthFromEnd(head,n);

        //now let's Print the updated list
        NthListNode currt = head;
        while(currt!= null){
            System.out.print(currt.val + " ");
            currt = currt.next;
        }
    }
}
