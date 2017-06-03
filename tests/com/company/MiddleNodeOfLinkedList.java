package com.company;

/**
 * Created by rong on 6/2/17.
 */
public class MiddleNodeOfLinkedList {
    public ListNode MiddleNodeOfLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fastPtr = head;
        while (fastPtr.next != null && fastPtr.next.next != null) {
            head = head.next;
            fastPtr = fastPtr.next.next;
        }
        return head;
    }
}
