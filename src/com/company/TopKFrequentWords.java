package com.company;

import java.util.*;

/**
 * Created by rong on 6/13/17.
 */
public class TopKFrequentWords {
    public String[] topKFrequent(String[] combo, int k) {
        if (combo == null || combo.length == 0 )  {
            return new String[0];
        }

        Map<String, Integer> freqMap = getFreqMap(combo);


        // create a minHeap with size k
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k,
            new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e1.getValue().compareTo(e2.getValue());
                }
            });


        for (Map.Entry<String, Integer> each : freqMap.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(each);
            } else if (each.getValue() > minHeap.peek().getValue()) {
                minHeap.poll();
                minHeap.offer(each);
            } else {
                continue;
            }
        }
        return getFreqArray(minHeap);
    }

    private HashMap<String, Integer> getFreqMap(String[] combo) {
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String s : combo) {
            Integer freq = freqMap.get(s);
            if (freq == null) {
                freqMap.put(s, 1);
            } else {
                freqMap.put(s, freq + 1);
            }
        }
        return freqMap;
    }


    private String[] getFreqArray(PriorityQueue<Map.Entry<String, Integer>> minHeap) {
        String[] freqArray = new String[minHeap.size()];
        for (int i = minHeap.size() - 1; i >= 0; i--) {
            freqArray[i] = minHeap.poll().getKey();
        }
        return freqArray;
    }
}


/**
 * Time Complexity:
 * build a hash map used O(n)
 * build a minHeap: in the worse case, we used (n-k) times of offer and poll, and offer and poll cost O(logk)
 *              so, O( (n-k) logk )
 * return freqArray used O(k) in the worse case
 *
 * Therefore, total time complexity is O(n+(n-k)logk+k) = O(n+nlogk)
 */
