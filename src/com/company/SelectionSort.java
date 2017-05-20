package com.company;

/**
 * Created by rong on 5/20/17.
 */
public class SelectionSort {
    public int[] selectionSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        for(int i = 0; i < array.length - 1; i++) {
            int curMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[curMinIndex] ) {
                    curMinIndex = j;
                }
            }
            swap(array, i, curMinIndex);
        }
        return array;
    }

    private void swap(int[] array, int i, int curMinIndex ){
        int temp = array[i];
        array[i] = array[curMinIndex];
        array[curMinIndex] = temp;
    }
}


/**
 * Can simplify the checking condition in the beginning because if the array == null, you can still return array
   since returning null is ok if the return type is int[].
 * in the swap, temp = array[i], not i. If you let temp=i, you only keep a box, but the thing inside it can be changed
   and is out of your control. You'll get into problem if you do swap later.
 */