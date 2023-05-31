package tech.strengthen.learn.leetcode;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        Q1 q1 = new Q1();
        System.out.println(Arrays.toString(q1.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int var1 = nums[i];
            for (int j = 0; j < nums.length && i != j; j++) {
                int var2 = nums[j];
                if (var1 + var2 == target) {
                    result[1] = i;
                    result[0] = j;
                    break;
                }
            }
        }
        return result;
    }
}
