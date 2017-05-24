package com.company;

/**
 * Created by rong on 5/22/17.
 */
public class ClassicalBinarySearch {
    public int classicalBS_iterative(int[] array, int target) {

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

    public int classicalBS_recursive(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        return classicalBS_recursive(array, left, right, target);
    }

    private int classicalBS_recursive(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }else if(array[mid] < target) {
                return classicalBS_recursive(array, mid + 1, right, target);
            } else {
                return classicalBS_recursive(array, left, mid - 1, target);
            }
        }
        return -1;
    }
}


/**
 * Iterative method:
 *      TimeComplexity = O(logn)
 *          Every time, the searching space is cut down half, i.e. 16, 8, 4, 2, 1. => 2^? = 16 => log 16 => logn
 *      SpaceComplexity = O(1)
 *
 * Recursive method:
 *      TimeComplexity = O(logn) // same reason as above
 *      SpaceComplexity = O(logn) // level of the recursion tree. 
 */
