package com.company;

/**
 * Created by rong on 5/24/17.
 */
public class ClosestKElements {
    public int[] closestK(int[] array, int k, int target) {
        if (array == null || array.length == 0) {
            return array;
        }else if (k == 0) {
            return new int[0];
        }

        // need to find the two neighbours of the target
        int left = leftNeighbourIndex(array, target);
        int right = left + 1;

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            // left is not out of bound and right is not out of bound
            // decrease left when
            // case 1: right is out of bound
            // case 2: distance from left to target is smaller than that from right to target
            if (right > array.length - 1 ||
                    left >= 0 && target - array[left] <= array[right] - target ) {
                result[i] = left--;
            }else {
                result[i] = right++;
            }
        }
        return result;
    }

    // i.e. 1,2,3,8,9      target = 4
    // we want to find the largest number among all that's <= target
    // in this case, we want to find 3
    private int leftNeighbourIndex(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;

        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (array[mid] >= target) {
                r = mid;
            }else {
                l = mid;
            }
        }

        if (array[r] <= target) {
            return r;
        }else if (array[l] <= target) {
            return l;
        }
        return -1;
    }
}


/**
 * Time Complexity = O(logn + k)
 *      Finding the left neighbour takes O(logn) because using binary search
 *      then finding k elements take O(k)
 *
 * Space Complexity = O(logn + k)
 *      the second function using O(logn) space because of the call stack
 *      then we reserved an array of size k to return, it takes O(k) space
 */
