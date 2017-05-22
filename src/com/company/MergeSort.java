package com.company;

/**
 * Created by rong on 5/20/17.
 */



public class MergeSort {
    public int[] mergeSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        split(array, 0, array.length - 1);
        return array;
    }

    private void split(int[] array, int left, int right) {
        // base case: when there is only one element to be splited
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        split(array, left, mid);
        split(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] helper = new int[array.length];
        // each time when we merge two parts, we need to copy from
        // the array because array is changed in place, so we need to get the newest version.
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }

        int l = left;
        int r = mid + 1;

        while (l <= mid && r <= right) {
            if (helper[l] <= helper[r]) {
                array[left++] = helper[l++];
            }else{
                array[left++] = helper[r++];
            }
        }

        while(l <= mid) {
            array[left++] = helper[l++];
        }
    }
}


/**
 * Time Complexity
 *      There are two phases, the split and the merge
 *      During the split, what we actually did was just to find the middle point, and that takes O(1).
 *      first level cut once, second level cut twice...last level cut n times. Therefore, O(n) for the split.
 *
 *      During the merge, merge n elements take O(n). Since there are logn levels in total, O(nlogn)
 *      Therefore, the total time complexity is O(nlogn)
 *
 * Space Complexity
 *      During the split: callstack logn levels. Therefore, O(logn)
 *      During the merge: We kept a helper array, so O(n).
 *      Hence, the total space complexity = O(n)
 */
