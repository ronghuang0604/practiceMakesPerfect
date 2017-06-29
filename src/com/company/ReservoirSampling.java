package com.company;

/**
 * Created by rong on 6/27/17.
 */

/**
 *  sample() returns null if there is no value read so far
 */

public class ReservoirSampling {

    private int counter;
    private Integer sample;

    public ReservoirSampling() {
        counter = 0;
        sample = null;
    }

    public void read(int value) {
        counter++;
        int prob = (int) (Math.random() * counter);
        if (prob == 0) {
            sample = value;
        }
    }

    public Integer sample() {
        return sample;
    }
}
