package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/24/17.
 */
class ClosestKElementsTest {
    @Test
    public void closestKTest() {
        int[] array = {1,2,5,7,10,11};
        int k = 2;
        int target = 6;
        ClosestKElements test = new ClosestKElements();
        int[] result = test.closestK(array,k, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void closestKTest1() {
        int[] array = {1,4,5,7,10,11};
        int k = 3;
        int target = 6;
        ClosestKElements test = new ClosestKElements();
        int[] result = test.closestK(array,k, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void closestKTest2() {
        int[] array = {1,1,1,1,1};
        int k = 3;
        int target = 1;
        ClosestKElements test = new ClosestKElements();
        int[] result = test.closestK(array,k, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void closestKTest3() {
        int[] array = {7,8};
        int k = 2;
        int target = 6;
        ClosestKElements test = new ClosestKElements();
        int[] result = test.closestK(array,k, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}