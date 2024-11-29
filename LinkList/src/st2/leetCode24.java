package st2;

public class leetCode24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode cur = dummyHead;
        while (cur.next != null && cur.next.next != null){
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next.next;

            cur.next = cur.next.next;
            cur.next.next = temp1;
            temp1.next = temp2;

            cur = cur.next.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {

    }
}
