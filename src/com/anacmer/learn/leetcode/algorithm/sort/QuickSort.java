package com.anacmer.learn.leetcode.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 15, 6, 1, 2};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int q = partition(arr, left, right);
            quickSort(arr, left, q - 1);
            quickSort(arr, q + 1, right);
        }
    }

    /**
     * 获取分区点
     */
    public int partition(int[] arr, int left, int right) {
        //默认区数组的最后一个值作为分区值
        int pivot = arr[right];
        int i = left;
        //找到比分区点小的值，将他往左排
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        //交换分区点与最后一个值的位置坐标
        arr[right] = arr[i];
        arr[i] = pivot;
        return i;
    }
}
