package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/2/17.
 */
class InsertNodeInSortedLLTest {
    @Test
    public void test1() {

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);

        InsertNodeInSortedLL test = new InsertNodeInSortedLL();
        ListNode result = test.insert(node1, 2);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }


    @Test
    public void test2() {

        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(3);

        InsertNodeInSortedLL test = new InsertNodeInSortedLL();
        ListNode result = test.insert(node1, 4);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

}