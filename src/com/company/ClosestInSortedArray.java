package com.company;

/**
 * Created by rong on 5/24/17.
 */
public class ClosestInSortedArray {
    public int closest(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }else if (array[mid] > target){
                right = mid;
            }else {
                left = mid;
            }
        }
        if ( Math.abs(array[left] - target) <= Math.abs(array[right] - target) ) {
            return left;
        }else {
            return right;
        }
    }
}


/**
 * Time Complexity = O(logn)
 * Space Complexity = O(1)
 */
