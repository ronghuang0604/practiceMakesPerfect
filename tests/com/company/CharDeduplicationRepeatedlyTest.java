package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/20/17.
 */
class CharDeduplicationRepeatedlyTest {
    @Test
    public void test1() {
        String input = "aabccd";
        CharDeduplicationRepeatedly test = new CharDeduplicationRepeatedly();
        System.out.println(test.deDup(input));
    }

}