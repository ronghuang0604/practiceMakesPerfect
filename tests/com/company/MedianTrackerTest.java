package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/29/17.
 */
class MedianTrackerTest {
    @Test
    public void test() {
        MedianTracker test = new MedianTracker();
        test.read(5);
        test.read(4);
        System.out.println(test.median());

    }

}