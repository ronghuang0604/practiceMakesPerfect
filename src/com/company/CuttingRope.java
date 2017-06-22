package com.company;

/**
 * Created by rong on 6/21/17.
 */
public class CuttingRope {
    public int maxProduct(int length) {
        if (length == 0) {
            return -1;
        } else if (length == 1) {
            return 0;
        } else if (length == 2) {
            return 1;
        }

        // base case
        int[] subSolution = new int[length + 1];
        subSolution[1] = 1;
        subSolution[2] = 1;

        for (int i = 0; i <= length; i++) { // for each possible rope length
            for (int j = 0; j <= i / 2; j++) { // for each possible way of cutting the rope
                                               // j is the right half
                subSolution[i] = Math.max(subSolution[i], Math.max(i-j, subSolution[i-j]) * j);
            }
        }
        return subSolution[length];
    }
}
