package st2;

import java.io.Serializable;

public class MyLinkedList implements Serializable {
    int size = 0;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index > size - 1){
            return -1;
        }

        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);

        newNode.next = head.next;
        head.next = newNode;
        size++;

    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);

        ListNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }

        cur.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode newNode = new ListNode(val);

        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        size++;

    }

    public void deleteAtIndex(int index) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            return;
        }

        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}
