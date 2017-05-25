package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/24/17.
 */
class LastOccurrenceTest {
    @Test
    public void lastOccurrenceTest1() {
        LastOccurrence test = new LastOccurrence();
        int[] array = {1,2,3,8,9};
        int target = 4;
        System.out.println(test.lastOccurrence(array, target));
    }

    @Test
    public void lastOccurrenceTest2() {
        LastOccurrence test = new LastOccurrence();
        int[] array = {1,1,1,1,1};
        int target = 1;
        System.out.println(test.lastOccurrence(array, target));
    }

    @Test
    public void lastOccurrenceTest3() {
        LastOccurrence test = new LastOccurrence();
        int[] array = {1,2,3,3,3,8,9};
        int target = 3;
        System.out.println(test.lastOccurrence(array, target));
    }

    @Test
    public void lastOccurrenceTest4() {
        LastOccurrence test = new LastOccurrence();
        int[] array = {1,2,2,2,5,8};
        int target = 2;
        System.out.println(test.lastOccurrence(array, target));
    }
}