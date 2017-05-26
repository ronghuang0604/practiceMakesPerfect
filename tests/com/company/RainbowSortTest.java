package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/26/17.
 */
class RainbowSortTest {
    @Test
    void rainbowSortTest1() {
        int[] array = {0, 0, -1, 1, 0, -1, 1};
        RainbowSort test = new RainbowSort();
        int[] result = test.rainbowSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    void rainbowSortTest2() {
        int[] array = {0, -1};
        RainbowSort test = new RainbowSort();
        int[] result = test.rainbowSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}

/**
 * Time Complexity = O(nk)
 * Suppose there are n elements in the array, we need to look at each element, so at least O(n).
 * If there are k distinct keys, and the current element is needed to be swapped with the very first one,
 * so we need to swap (k-1) times until everyone is at he correct place, and that is for each element (O(k-1)),
 * for n elements, it takes O(nk).
 */