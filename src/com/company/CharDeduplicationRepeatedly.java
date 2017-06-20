package com.company;

/**
 * Created by rong on 6/20/17.
 */
public class CharDeduplicationRepeatedly {
    public String deDup(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] inputArray = input.toCharArray();
        int s = 0;
        for(int f = 1; f < inputArray.length; f++) {
            if (s != -1 &&inputArray[f] == inputArray[s]) {
                s--;
                while (f+1 < inputArray.length && inputArray[f] == inputArray[f+1]) {
                    f++;
                }
            } else {
                inputArray[++s] = inputArray[f];
            }
        }
        return new String(inputArray, 0, s+1);
    }
}
