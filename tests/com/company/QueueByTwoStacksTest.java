package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/1/17.
 */
class QueueByTwoStacksTest {
    @Test
    public void test1() {
        QueueByTwoStacks test = new QueueByTwoStacks();
        test.offer(1);
        test.offer(2);
        System.out.println(test.size()); // 2
        test.offer(5);
        test.offer(6);
        test.poll();
        test.poll();
        System.out.println(test.peek()); // 5
        System.out.println(test.isEmpty()); // false

    }

}