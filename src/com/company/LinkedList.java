package com.company;

/**
 * Created by rong on 6/1/17.
 */

class ListNode {
    int value;
    ListNode next;
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}


public class LinkedList {

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

////    // get the value of node at index in the linked list
//    public ListNode get(ListNode head, int index) {
//        if (head == null || index <= 0) {
//            return null;
//        }
//
//
//        while (head != null && index > 0) {
//            head = head.next;
//
//        }
//
//        return head;
//    }



    // append a node with value n at the head
    public ListNode appendHead(ListNode head, int n) {
        ListNode newHead = new ListNode(n);
        newHead.next = head;
        return newHead;
    }


    public ListNode appendTail(ListNode head, int n) {
        ListNode newNode = new ListNode(n);
        if (head == null) {
            return newNode;
        }

        ListNode dummy = head;
        while (dummy.next != null) {
            dummy = dummy.next;
        }
        // here, head is the last node
        dummy.next = newNode;
        return head;
    }


    public ListNode remove(ListNode head, int target ) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.value == target) {
                cur.next = cur.next.next;
                return head;
            }
            head = head.next;
        }
        if (cur.value == target) {

            return head;
        }
        return null;
    }
}
