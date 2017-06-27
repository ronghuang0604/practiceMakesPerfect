package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/27/17.
 */
class PerfectShuffleTest {
    @Test
    public void test() {
        PerfectShuffle test = new PerfectShuffle();
        int array[] = {1,2,3,4,5};
        test.shuffle(array);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}