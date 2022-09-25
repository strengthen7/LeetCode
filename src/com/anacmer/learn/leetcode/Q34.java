package com.anacmer.learn.leetcode;

import java.util.Arrays;

public class Q34 {

    public static void main(String[] args) {
        Q34 q34 = new Q34();
        int[] ints = q34.searchRange(new int[]{1, 2, 3, 4, 5, 1, 2}, 2);
        System.out.println(Arrays.toString(ints));
    }

    public int[] searchRange(int[] nums, int target) {
        int i = binarySearchFirstOne(nums, nums.length, target);
        int j = binarySearchLastOne(nums, nums.length, target);
        return new int[]{i, j};
    }

    public int binarySearchFirstOne(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == 0) || (a[mid - 1] != value)) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 查找目标值最后一次出现的位置
     */
    public int binarySearchLastOne(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] != value)) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

}
