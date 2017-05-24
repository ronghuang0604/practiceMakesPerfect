package com.company;

/**
 * Created by rong on 5/23/17.
 */
public class SearchInMatrix {
    public int[] searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{ -1, -1 };
        }

        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while( left <= right) {
            int mid = left + (right - left) / 2;
            int mid_row = mid / matrix[0].length;
            int mid_col = mid % matrix[0].length;
            if (matrix[mid_row][mid_col] == target) {
                return new int[] {mid_row, mid_col};
            }else if (matrix[mid_row][mid_col] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
