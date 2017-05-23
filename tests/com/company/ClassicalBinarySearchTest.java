package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/23/17.
 */
class ClassicalBinarySearchTest {
    @Test
    void classicalBinarySearchTest() {
        ClassicalBinarySearch test = new ClassicalBinarySearch();
        int[] array = {1,2,3,4,5};
        int target = 3;
        System.out.println(test.classicalBS_iterative(array, target));
    }

    @Test
    void classicalBinarySearchTest1() {
        ClassicalBinarySearch test = new ClassicalBinarySearch();
        int[] array = {1,2,3,4,5};
        int target = 7;
        System.out.println(test.classicalBS_iterative(array, target));
    }

    @Test
    void classicalBinarySearchTest2() {
        ClassicalBinarySearch test = new ClassicalBinarySearch();
        int[] array = {1,2,3,4,5};
        int target = 1;
        System.out.println(test.classicalBS_iterative(array, target));
    }

    @Test
    void classicalBinarySearchTest3() {
        ClassicalBinarySearch test = new ClassicalBinarySearch();
        int[] array = {1,2,3,4,5};
        int target = 2;
        System.out.println(test.classicalBS_iterative(array, target));
    }

    @Test
    void classicalBS_recursive1() {
        ClassicalBinarySearch test = new ClassicalBinarySearch();
        int[] array = {1,2,3,4,5};
        int target = 2;
        System.out.println(test.classicalBS_recursive(array, target));
    }

    @Test
    void classicalBS_recursive2() {
        ClassicalBinarySearch test = new ClassicalBinarySearch();
        int[] array = {1,1,3,4,5};
        int target = 3;
        System.out.println(test.classicalBS_recursive(array, target));
    }
}