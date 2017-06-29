package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/27/17.
 */
class ReservoirSamplingTest {

    @Test
    public void test(){
        ReservoirSampling test = new ReservoirSampling();
        test.read(1);
        test.read(2);
        test.read(3);

        test.read(4);
        test.read(5);
        test.read(6);
        System.out.println(test.sample());

        test.read(7);

    }


}