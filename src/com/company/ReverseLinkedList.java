package com.company;

/**
 * Created by rong on 6/1/17.
 */
public class ReverseLinkedList {

    class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public ListNode ReverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    /**
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     */

//    public recursiveMethod(ListNode head) {
//
//    }
}
