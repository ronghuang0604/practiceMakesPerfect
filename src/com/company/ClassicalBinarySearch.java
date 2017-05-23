package com.company;

/**
 * Created by rong on 5/22/17.
 */
public class ClassicalBinarySearch {
    public int classicalBS(int[] array, int target) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == array[mid]) {
                return mid;
            }else if (target > array[mid]) {
                left = mid + 1; // or left = mid;
            }else if (target < array[mid]){
                right = mid - 1; // or right = mid;
            }
         }
         return -1;
    }
}
