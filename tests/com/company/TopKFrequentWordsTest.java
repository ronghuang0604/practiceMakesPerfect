package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/13/17.
 */
class TopKFrequentWordsTest {
    @Test
    public void test1() {
        String[] Composition = {"a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};
        TopKFrequentWords test = new TopKFrequentWords();
        String[] result = test.topKFrequent(Composition, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    @Test
    public void test2() {
        String[] Composition = {"a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};
        TopKFrequentWords test = new TopKFrequentWords();
        String[] result = test.topKFrequent(Composition, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    @Test
    public void test3() {
        String[] Composition = {"a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};
        TopKFrequentWords test = new TopKFrequentWords();
        String[] result = test.topKFrequent(Composition, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
