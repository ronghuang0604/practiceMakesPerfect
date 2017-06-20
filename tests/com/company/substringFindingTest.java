package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/20/17.
 */
class substringFindingTest {
    @Test
    public void test() {
        String large = "abcd";
        String small = "";
        substringFinding test = new substringFinding();
        System.out.println(test.strstr(large, small));
    }

    @Test
    public void test1() {
        String large = "abcd";
        String small = "bc";
        substringFinding test = new substringFinding();
        System.out.println(test.strstr(large, small));
    }

    @Test
    public void test2() {
        String large = "aabbaabbaabbccaabbaabbaabbaabbcc";
        String small = "aabbaabbaabbaabbcc";
        substringFinding test = new substringFinding();
        System.out.println(test.strstr(large, small));
    }





}