package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/24/17.
 */
class FirstOccurrenceTest {
    @Test
    public void firstOccurrenceTest1() {
        FirstOccurrence test = new FirstOccurrence();
        int[] array = {1,2,3,8,9};
        int target = 4;
        System.out.println(test.firstOccurrence(array, target));
    }

    @Test
    public void firstOccurrenceTest2() {
        FirstOccurrence test = new FirstOccurrence();
        int[] array = {1,1,1,1,1};
        int target = 1;
        System.out.println(test.firstOccurrence(array, target));
    }

    @Test
    public void firstOccurrenceTest3() {
        FirstOccurrence test = new FirstOccurrence();
        int[] array = {1,2,3,3,3,8,9};
        int target = 3;
        System.out.println(test.firstOccurrence(array, target));
    }

}