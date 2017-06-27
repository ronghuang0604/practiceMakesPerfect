package com.company;
import java.util.Random;
/**
 * Created by rong on 6/27/17.
 */
public class PerfectShuffle {
    public void shuffle(int[] array) {

        if(array == null || array.length <= 1) {
            return;
        }

        for (int i = array.length; i > 1; i--) {
            int randomIndex = (int)(Math.random() * i);
            swap(array, randomIndex, i-1);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
