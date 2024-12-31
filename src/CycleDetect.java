class SListNode{
    int val;
    SListNode next;
    SListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class CycleDetect {
    public static boolean cycleDetect(SListNode head){
        if(head==null){
            return false:
        }
        SListNode Fast = head;
        SListNode Slow = head;
        while(Fast.next!=null && Fast.next.next != null){
            Fast = Fast.next.next;
            Slow = Slow.next;

            if(Fast==Slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        SListNode head = new SListNode(1);
        head.next = new SListNode(2);
        head.next.next = new SListNode(3);
        head.next.next.next = new SListNode(4);
        head.next.next.next.next = new SListNode(5);

        //let's create a loop in LinkedList
        head.next.next.next.next = head.next;

        boolean HasCycle = cycleDetect(head);
        if(HasCycle){
            System.out.println("Cycle Detected in Linkedlist");
        }else{
            System.out.println("Cycle Not Detected");
        }

    }
}

