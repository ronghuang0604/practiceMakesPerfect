package com.company;

/**
 * Created by rong on 6/21/17.
 */
public class LongestAscendingSubArray {
    public int longest(int[] array) {
        if (array == null) {
            return -1;
        } else if (array.length == 0) {
            return 0;
        }
        int curMax = 1;
        int globalMax = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                curMax += 1;
                globalMax = Math.max(globalMax, curMax);
            } else {
                curMax = 1;
            }
        }
        return globalMax;
    }
}
