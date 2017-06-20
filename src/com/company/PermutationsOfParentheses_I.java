//package com.company;
//
///**
// * Created by rong on 6/16/17.
// */
//
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Given N pairs of parentheses “()”, return a list with all the valid permutations.
// */
//
//// how many levels are there in the recursion tree
//// how many branches does each node have
//
//public class PermutationsOfParentheses_I {
//    public List<String> parentheses(int N) {
//    List<String> result = new ArrayList<>();
//    if (N <= 0) {
//        return result;
//    }
//
//
//    StringBuilder sb = new StringBuilder();
//    parentheses(N, N, sb, result);
//    return result;
//    }
//
//    private void parentheses(int remain_left, int remain_right, StringBuilder sb, List<String> result) {
//        // base case
//        if (remain_left == 0 && remain_right == 0) {
//            result.add(sb.toString());
//        }
//
//
//        // add left parentheses when remain_left is not zero,
//
//        if (remain_left > 0) {
//            parentheses(remain_left - 1, remain_right, sb.append());
//        }
//    }
//}
