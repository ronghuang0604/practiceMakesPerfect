package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/22/17.
 */
class aToThePowerOfbTest {
    @Test
    void aToThePowerOfbTest() {
        int a = 2, b = 1000;
        aToThePowerOfb test = new aToThePowerOfb();
        long result = test.a_power_b(a, b);
        System.out.println(result);
    }

    @Test
    void aToThePowerOfbTest1() {
        int a = 2, b = 2;
        aToThePowerOfb test = new aToThePowerOfb();
        long result = test.a_power_b(a, b);
        System.out.println(result);
    }

    @Test
    void aToThePowerOfbTest2() {
        int a = 2, b = 10;
        aToThePowerOfb test = new aToThePowerOfb();
        long result = test.a_power_b(a, b);
        System.out.println(result);
    }

    @Test
    void aToThePowerOfbTest3() {
        int a = 2, b = 19;
        aToThePowerOfb test = new aToThePowerOfb();
        long result = test.a_power_b(a, b);
        System.out.println(result);
    }

    @Test
    void aToThePowerOfbTest4() {
        int a = 2, b = 50;
        aToThePowerOfb test = new aToThePowerOfb();
        long result = test.a_power_b(a, b);
        System.out.println(result);
    }

}