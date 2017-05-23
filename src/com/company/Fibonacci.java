package com.company;

/**
 * Created by rong on 5/23/17.
 */
public class Fibonacci {
    public long fibo(int K) {
        if (K == 0) {
            return 0;
        }else if (K == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        long next_val = 1;

        while (K > 1) {
            next_val = a + b;
            a = b;
            b = next_val;
            K--;
        }
        return next_val;
    }
}


/**
 * TimeComplexity = O(K)
 * SpaceComplexity = O(1)
 */
