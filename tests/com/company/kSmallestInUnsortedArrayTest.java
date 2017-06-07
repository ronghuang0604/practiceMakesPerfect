package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/6/17.
 */
class kSmallestInUnsortedArrayTest {
    @Test
    public void test() {
        kSmallestInUnsortedArray test = new kSmallestInUnsortedArray();
        int[] array = {5,3,4,2,1,1,2,1,8,4,4,9,13,5,8};
        int[] result = test.kSmallest_maxHeap(array, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    @Test
    public void test1() {
        kSmallestInUnsortedArray test = new kSmallestInUnsortedArray();
        int[] array = {5,3,4,2,1};
        int[] result = test.kSmallest_maxHeap(array, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}