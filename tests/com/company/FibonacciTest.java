package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/23/17.
 */
class FibonacciTest {
    @Test
    void FibonacciTest1() {
        Fibonacci test = new Fibonacci();
        int K = 4;
        System.out.println(test.fibo(K));
    }

    @Test
    void FibonacciTest2() {
        Fibonacci test = new Fibonacci();
        int K = 7;
        System.out.println(test.fibo(K));
    }

    @Test
    void FibonacciTest3() {
        Fibonacci test = new Fibonacci();
        int K = 1;
        System.out.println(test.fibo(K));
    }

    @Test
    void FibonacciTest4() {
        Fibonacci test = new Fibonacci();
        int K = 2;
        System.out.println(test.fibo(K));
    }

    @Test
    void FibonacciTest5() {
        Fibonacci test = new Fibonacci();
        int K = 0;
        System.out.println(test.fibo(K));
    }

}