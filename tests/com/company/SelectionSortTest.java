package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/20/17.
 */
class SelectionSortTest {
    @Test
    void selectionSort1() {
        int[] array = {5,4,3,2,1};

        SelectionSort test = new SelectionSort();
        int[] result = test.selectionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    void selectionSort2() {
        int[] array = {};

        SelectionSort test = new SelectionSort();
        int[] result = test.selectionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    @Test
    void selectionSort3() {
        int[] array = {1,1,1};

        SelectionSort test = new SelectionSort();
        int[] result = test.selectionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    @Test
    void selectionSort4() {
        int[] array = {2,4,1,5,3};

        SelectionSort test = new SelectionSort();
        int[] result = test.selectionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}