package st2;


public class leetCode203 {
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }

        ListNode cur = head;
        while (cur != null && cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static ListNode removeElements2(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
