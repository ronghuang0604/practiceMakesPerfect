package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/1/17.
 */
class StackWithMinIITest {
    @Test
    public void test1() {
        StackWithMinII test = new StackWithMinII();
        test.push(5);
        test.push(4);
        test.push(3);

        test.push(3);
        test.push(3);
        test.push(3);
        test.pop();
        test.pop();
        test.pop();
        test.pop(); // 4

        System.out.println(test.min());

    }

}