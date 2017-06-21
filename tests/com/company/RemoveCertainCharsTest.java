package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/21/17.
 */
class RemoveCertainCharsTest {
    @Test
    public void test() {
        String input = "abcd";
        String target = "ab";
        RemoveCertainChars test = new RemoveCertainChars();
        System.out.println(test.remove(input, target));
    }

}