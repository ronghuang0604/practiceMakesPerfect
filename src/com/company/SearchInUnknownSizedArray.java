package com.company;


/**
 * Created by rong on 5/25/17.
 */

interface Dictionary {
    public Integer get(int index);
  }


public class SearchInUnknownSizedArray {
    public int searchUnknownSize(Dictionary dict, int target) {
        if (dict == null) {
            return -1;
        }

        // sliding window until we find the right bound
        // we keep sliding window until
        // (1) right is null
        // (2) target is inside the window
        int left = 0;
        int right = 1;
        while (dict.get(right) != null && dict.get(right) < target) {
            left = right;
            right = 2 * right;
        }

        // either right is null or target is inside the windown
        // what we need to do now is to find the target using classical binary search
        return findTarget(dict, target, left, right);
    }

    private int findTarget(Dictionary dict, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dict.get(mid) == null || dict.get(mid) > target) {
                right = mid - 1;
            }else if (dict.get(mid) < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}



