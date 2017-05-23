package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/22/17.
 */
class QuickSortTest {

    @Test
    void QuickSortTest1(){
        int[] array = {4,2,1,5};
        QuickSort test = new QuickSort();
        int[] result = test.quickSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    void QuickSortTest2(){
        int[] array = {5,4,3,2,1};
        QuickSort test = new QuickSort();
        int[] result = test.quickSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }


    @Test
    void QuickSortTest3(){
        int[] array = {};
        QuickSort test = new QuickSort();
        int[] result = test.quickSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    void QuickSortTest4(){
        int[] array = {1,2,3,4,5};
        QuickSort test = new QuickSort();
        int[] result = test.quickSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}