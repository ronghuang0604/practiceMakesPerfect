package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by rong on 6/6/17.
 */
public class kSmallestInUnsortedArray {
    public int[] kSmallest_minHeap(int[] array, int k) {
        if (array == null || array.length == 0 || k <= 0) {
            return new int[0];
        }
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        // heapify all elements in the array
        for (int i = 0; i < array.length; i++) {
            minHeap.offer(array[i]);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    public int[] kSmallest_maxHeap(int[] array, int k) {
        if (array == null || array.length == 0 || k <= 0) {
            return new int[0];
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            maxHeap.offer(array[i]);
        }

        for(int i = k;i < array.length; i++) {
            if (array[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
