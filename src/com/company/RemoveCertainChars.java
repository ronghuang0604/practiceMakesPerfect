package com.company;

/**
 * Created by rong on 6/21/17.
 */
public class RemoveCertainChars {
    public String remove(String input, String target) {
        if (input == null || target == null) {
            return null;
        } else if (input.length() == 0 || target.length() == 0) {
            return input;
        }

        char[] inputArray = input.toCharArray();
        char[] targetArray = target.toCharArray();

        int s = 0;
        for (int f = 0; f < inputArray.length; f++) {
            if (equals(inputArray, targetArray, f)) {
                continue;
            }
            inputArray[s++] = inputArray[f];
        }
        return new String(inputArray, 0, s);
    }

    private boolean equals(char[] inputArray, char[] targetArray, int index) {
        for (int i = 0; i < targetArray.length; i++) {
            if (inputArray[index] == targetArray[i]) {
                return true;
            }
        }
        return false;
    }
}
