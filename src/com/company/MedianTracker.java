package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by rong on 6/29/17.
 */
public class MedianTracker {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianTracker(){
        maxHeap = new PriorityQueue<>(11, Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void read(int value) {
        if (maxHeap.isEmpty() || value <= maxHeap.peek()) {
            maxHeap.offer(value);
        } else{
            minHeap.offer(value);
        }


        // maxHeap.size() == minHeap.size() or
        // maxHeap.size() == minHeap.size() + 1

        // minHeap.size() + 1 == maxHeap.size() or
        // maxHeap.size() == minHeap.size()

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public Double median() {
        int size = maxHeap.size() + minHeap.size();
        if (size == 0) {
            return null;
        }else if (size % 2 != 0) { // odd number
            return (double) maxHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

}
