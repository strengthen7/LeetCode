package com.anacmer.learn.leetcode.everyday;

public class D1007MaxSubArraySum {

    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp += nums[i];
            } else {
                maxSum = Math.max(maxSum, temp);
                temp = nums[i];
            }
        }
        maxSum = Math.max(maxSum, temp);
        return maxSum;
    }

    public static void main(String[] args) {
        D1007MaxSubArraySum d1007MaxSubArraySum = new D1007MaxSubArraySum();
        System.out.println(d1007MaxSubArraySum.maxAscendingSum(new int[]{1, 100, 10}));
    }
}
