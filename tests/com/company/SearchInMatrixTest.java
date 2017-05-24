package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 5/24/17.
 */
class SearchInMatrixTest {
    @Test
    void searchMatrixTest1() {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        SearchInMatrix test = new SearchInMatrix();
        int[] result = test.searchMatrix(matrix, 12);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    @Test
    void searchMatrixTest2() {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        SearchInMatrix test = new SearchInMatrix();
        int[] result = test.searchMatrix(matrix, 0);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    void searchMatrixTest3() {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        SearchInMatrix test = new SearchInMatrix();
        int[] result = test.searchMatrix(matrix, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}