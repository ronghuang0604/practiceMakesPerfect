package com.company;
import java.lang.String;

/**
 * Created by rong on 6/20/17.
 */

public class CharDeduplication {
    public String deduplication(String input) {

        if (input == null || input.length() == 0) {
            return input;
        }

        char[] inputArray = input.toCharArray();

        int sPtr = 0;
        int fPtr;

        for (fPtr = 1; fPtr < inputArray.length; fPtr++) {
            if (inputArray[fPtr] != inputArray[sPtr]){
                sPtr++;
                inputArray[sPtr] = inputArray[fPtr];
            }
        }

        return new String(inputArray, 0, sPtr + 1);
                        // char     startIndex      count

    }
}



/**
 * Time = O(n) since we need to loop through all the chars
 * Space = O(1) since we did it in place
 * */