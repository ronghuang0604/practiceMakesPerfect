package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/20/17.
 */
class CharDeduplicationTest {
    @Test
    public void test1() {
        String input = "abbc";
        CharDeduplication test = new CharDeduplication();
        System.out.println(test.deduplication(input));
    }

}