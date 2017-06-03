package com.company;

/**
 * Created by rong on 6/2/17.
 */
public class CheckCycleInLInkedList {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fastPtr = head;
        while (fastPtr.next != null && fastPtr.next.next != null) {
            head = head.next;
            fastPtr = fastPtr.next.next;
            if (head == fastPtr) {
                return true;
            }
        }
        return false;
    }
}
