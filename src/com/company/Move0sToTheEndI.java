package com.company;

/**
 * Created by rong on 5/22/17.
 */
public class Move0sToTheEndI {
    public int[] moveZero(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] != 0 ){
                i++;
            }else{
                swap(array, i, j);
                j--;
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
