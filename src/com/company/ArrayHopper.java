package com.company;

/**
 * Created by rong on 6/22/17.
 */
public class ArrayHopper {
    public boolean canJump(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        boolean[] canReach = new boolean[array.length];

        // base case
        canReach[0] = true;

        // inductive rule
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (canReach[j] && j + array[j] >= i) {
                    canReach[i] = true;
                    break;
                }
            }
        }
        return canReach[array.length - 1];
    }
}
