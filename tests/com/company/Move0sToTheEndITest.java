package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/22/17.
 */
class Move0sToTheEndITest {
    @Test
    void Move0sToTheEndITest1(){
        int[] array = {4,0,2,1,0, 5};
        Move0sToTheEndI test = new Move0sToTheEndI();
        int[] result = test.moveZero(array);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}