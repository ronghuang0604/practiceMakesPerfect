package com.company;

/**
 * Created by rong on 5/24/17.
 */
public class FirstOccurrence {
    public int firstOccurrence(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(array[mid] >= target) {
                right = mid ;
            }else {
                left = mid + 1;
            }
        }

        if (array[left] == target) {
            return left;
        }else if (array[right] == target) {
            return right;
        }
        return -1;
    }
}


/**
 * Time Complexity = O(logn)
 * Space Complexity = O(1)
 */