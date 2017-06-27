package com.company;

/**
 * Created by rong on 6/24/17.
 */
public class StringReplace {
    public String replace(String input, String s, String t) {
        return replaceShorter(input, s, t);
    }


    private String replaceShorter(String input, String s, String t) {

        char[] inputArray = input.toCharArray();
        int sPtr = 0;
        int f = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (f <= inputArray.length - s.length() && findMatch(inputArray, f, s)) {
                copy(inputArray, f, t);
                f += t.length();
                sPtr += t.length();
            } else {
                inputArray[sPtr++] = inputArray[f++];
            }
        }
        return new String(inputArray, 0, sPtr);

    }

    private boolean findMatch(char[] inputArray, int fromIndex, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (inputArray[fromIndex+i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    private void copy(char[] inputArray, int fromIndex, String t) {
        for(int i = 0; i < t.length(); i++) {
            inputArray[fromIndex + i] = t.charAt(i);
        }
    }



    // private String replaceLonger(String input, String s, String t) {

    // }
}
