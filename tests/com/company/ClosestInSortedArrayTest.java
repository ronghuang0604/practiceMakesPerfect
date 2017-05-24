package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/24/17.
 */
class ClosestInSortedArrayTest {
    @Test
    void closestTest() {
        ClosestInSortedArray test = new ClosestInSortedArray();
        int[] array = {1,2,3,8,9};
        int target = 4;
        System.out.println(test.closest(array, target));
    }

    @Test
    void closestTest1() {
        ClosestInSortedArray test = new ClosestInSortedArray();
        int[] array = {1, 1, 1, 1};
        int target = 4;
        System.out.println(test.closest(array, target));
    }

    @Test
    void closestTest2() {
        ClosestInSortedArray test = new ClosestInSortedArray();
        int[] array = {1,2,3,4,5};
        int target = 4;
        System.out.println(test.closest(array, target));
    }

    @Test
    void closestTest3() {
        ClosestInSortedArray test = new ClosestInSortedArray();
        int[] array = {1,2,3,4,5};
        int target = 7;
        System.out.println(test.closest(array, target));
    }

    @Test
    void closestTest4() {
        ClosestInSortedArray test = new ClosestInSortedArray();
        int[] array = {1,3};
        int target = 2;
        System.out.println(test.closest(array, target));
    }

}