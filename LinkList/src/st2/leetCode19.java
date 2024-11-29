package st2;

public class leetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        n++;
        while (n != 0){
            fast = fast.next;
            n--;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        if(slow.next != null){
            slow.next = slow.next.next;
        }


        return dummyHead.next;
    }

    public static void main(String[] args) {

    }
}
