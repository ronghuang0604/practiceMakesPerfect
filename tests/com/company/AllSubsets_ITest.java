package com.company;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/16/17.
 */
class AllSubsets_ITest {
    @Test
    public void test1() {
        String set = "abc";
        AllSubsets_I test = new AllSubsets_I();
        List<String> result = test.subSets(set);
        System.out.print("[ ");
        for (String str : result) {
            System.out.print(str + "," );
        }
        System.out.print(" ]");
    }

}