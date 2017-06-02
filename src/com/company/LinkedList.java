package com.company;

/**
 * Created by rong on 6/1/17.
 */
public class LinkedList {

    class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList() {

    }

    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
