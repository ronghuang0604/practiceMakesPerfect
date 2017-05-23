package com.company;

/**
 * Created by rong on 5/22/17.
 */
public class QuickSort {

    public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {

        // base case: when there is only 1 element left to be quick sorted
        if (left >= right) {
            return;
        }

        // randomly pick a pivot
        int pivot = findPivotIndex(left, right);
        // swap the pivot and the last element
        swap(array, pivot, right);
        int i = left;
        int j = right - 1;

        while(i <= j) {
            if (array[i] >= array[right]) {
                swap(array, i, j);
                j--;
            }else{
                i++;
            }
        }
        swap(array, i, right);

        // quick sort pivot left and right
        quickSort(array, left, i-1);
        quickSort(array, i+1, right);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int findPivotIndex(int lower, int upper) {
        return (int)(Math.random() * (upper-lower+1) + lower);
    }
}

/**
 * Time Complexity = O(nlogn) on average. // logn levels, each level O(n)
 *                 = O(n^2) worse case  // (n-1) levels, each level O(n)
 */


/** Generating a random number in Java
 * General formula (int)( (Math.random()*(upper-lower+1)) + lower )
 * For example,
 *      [0, 100]: (int)(Math.random() * 101 + 0 )
 *      [10, 20]: (int)(Math.random() * 11 + 10 )
 */


