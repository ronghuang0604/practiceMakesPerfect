package com.company;

/**
 * Created by rong on 5/26/17.
 */

/**
Given an array of balls, where the color of the balls can only be Red, Green or Blue,
 sort the balls such that all the Red balls are grouped on the left side,
 all the Green balls are grouped in the middle and all the Blue balls are grouped on the right side.
 (Red is denoted by -1, Green is denoted by 0, and Blue is denoted by 1).

        Examples

        {0} is sorted to {0}
        {1, 0} is sorted to {0, 1}
        {1, 0, 1, -1, 0} is sorted to {-1, 0, 0, 1, 1}
 */


/**
 *    -1 -1 -1 0 0 0 ???? 1 1 1
 *             r     g  b
 *
 *     [0, r): red -1
 *     [r, g): green 0
 *     [g, b]: unknown
 *     (b, n]: blue 1
 *
 *
 *
 *     ? ? ? ? ? ? ? ? ?
 *     r
 *     g
 *                     b
 */


public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        int r = 0;
        int g = 0;
        int b = array.length - 1;

        while (g <= b) {
            if (array[g] == -1) {
                swap(array, r++, g++);
            }else if (array[g] == 0) {
                g++;
            }else if (array[g] == 1) {
                swap(array, g, b--);
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
