package com.company;

/**
 * Created by rong on 6/20/17.
 */
public class removeExtraSpaces {
    public String remove(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] inputArray = input.toCharArray();
        int s = 0;
        for(int f = 0; f < inputArray.length; f++) {
            if (inputArray[f] == ' ' && (f == 0 || inputArray[f-1] == ' ')) {
                continue; // f++
            }
            inputArray[s++] = inputArray[f];
        }

        // post processing
        if (inputArray[s-1] == ' ' ) {
            return new String(inputArray, 0, s-1);
        }
        return new String(inputArray, 0, s);
    }
}

