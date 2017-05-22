package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/21/17.
 */
class MergeSortTest {
    @Test
    void MergeSortTest1(){
        int[] array = {4,2,1,5};
        MergeSort test = new MergeSort();
        int[] result = test.mergeSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    void MergeSortTest2(){
        int[] array = {};
        MergeSort test = new MergeSort();
        int[] result = test.mergeSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    void MergeSortTest3(){
        int[] array = {5};
        MergeSort test = new MergeSort();
        int[] result = test.mergeSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    void MergeSortTest4(){
        int[] array = {1,2,3,4,5};
        MergeSort test = new MergeSort();
        int[] result = test.mergeSort(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

}