package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/1/17.
 */
class StackWithMinTest {
    @Test
    void test1() {
        StackWithMin test = new StackWithMin();
        test.push(1);
        test.push(2);
        test.push(5);
        test.push(6);

        test.pop();
        test.pop();
        System.out.println(test.top()); // 2
        test.pop();
        System.out.println(test.top()); // 1

        System.out.println(test.min()); // 1
        System.out.println(test.pop()); // 1

        //stack is empty

        System.out.println(test.pop()); // null
        System.out.println(test.min()); // null
        System.out.println(test.top()); // null

    }

}