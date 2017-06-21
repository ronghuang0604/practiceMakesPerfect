package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/20/17.
 */
class removeExtraSpacesTest {
    @Test
    public void test() {
        String input = "   I     love MTV ";
        removeExtraSpaces test = new removeExtraSpaces();
        System.out.println(test.remove(input));

    }

}