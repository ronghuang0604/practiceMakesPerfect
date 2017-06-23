package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/22/17.
 */
class ArrayHopperTest {
    @Test
    public void test() {
        int[] array = {2,1,1,1,2};
        ArrayHopper test = new ArrayHopper();
        System.out.println(test.canJump(array));
    }

    @Test
    public void test1() {
        int[] array = {2,1,1,0,2};
        ArrayHopper test = new ArrayHopper();
        System.out.println(test.canJump(array));
    }

}