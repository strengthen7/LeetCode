package com.anacmer.learn.leetcode.week.w313;

public class MaxHourglassNum {
    public int maxSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int maxNum = -1;
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int num = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                        + grid[i + 1][j + 1]
                        + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                maxNum = Math.max(maxNum, num);
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        MaxHourglassNum maxHourglassNum = new MaxHourglassNum();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = maxHourglassNum.maxSum(grid);
        System.out.println(result);
    }
}
