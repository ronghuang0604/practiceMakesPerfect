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