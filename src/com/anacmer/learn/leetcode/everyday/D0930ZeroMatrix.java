package com.anacmer.learn.leetcode.everyday;

import java.util.Arrays;

/**
 * devise an algorithm，if have zero number in  M × N matrix，then clears the row and column where it is located。
 * <p>
 * input：
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * output：
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 */
public class D0930ZeroMatrix {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = column[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        D0930ZeroMatrix d0930ZeroMatrix = new D0930ZeroMatrix();
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        d0930ZeroMatrix.setZeroes(arr);
    }
}
