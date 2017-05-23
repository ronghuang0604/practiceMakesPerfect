package com.company;

/**
 * Created by rong on 5/22/17.
 */
public class aToThePowerOfb {
    public long a_power_b(int a, int b) {
        if (b == 0) {
            return 1;
        }else if (b == 1) {
            return a;
        }
        long half_result = a_power_b(a, b / 2);
        if (b % 2 == 0) { // even number
            return half_result * half_result;
        }else{
            return half_result * half_result * a;
        }
    }
}

/**
 * Time
 */
