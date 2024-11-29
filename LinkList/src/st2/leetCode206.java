package st2;

public class leetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;

        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}
