package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/2/17.
 */
class ReverseLinkedListTest {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);

        ReverseLinkedList test = new ReverseLinkedList();
//        ListNode head = test.iterativeMethod(node1);


    }
}