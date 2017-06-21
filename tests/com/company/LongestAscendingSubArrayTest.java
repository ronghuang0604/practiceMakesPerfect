package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/21/17.
 */
class LongestAscendingSubArrayTest {
    @Test
    public void test() {
        int[] input = {1};
        LongestAscendingSubArray test = new LongestAscendingSubArray();
        System.out.println(test.longest(input));
    }

    @Test
    public void test1() {
        int[] input = {7,2,3,1,5,8,9,6};
        LongestAscendingSubArray test = new LongestAscendingSubArray();
        System.out.println(test.longest(input));
    }
}

/**
 * Time = O(n)
 * Space = O(1)
 */
