package tech.strengthen.learn.leetcode.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 归并排序的思想是分治法。实现的手段则是递归
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 15, 6, 1, 2};
        int[] temp = new int[arr.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, arr.length - 1, temp);
    }

    /**
     * 递归调用进行排序
     *
     * @param arr  待排序的数据数组
     * @param temp 临时数组
     * @param low  排序区间开始下标
     * @param high 排序区间结束下标
     */
    public void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, temp);
            mergeSort(arr, mid + 1, high, temp);
            mergeArr(arr, low, mid, high, temp);
        }
    }

    /**
     * 合并数组
     */
    public void mergeArr(int[] arr, int low, int mid, int high, int[] temp) {
        int i = 0;
        int j = low, k = mid + 1;  //左边序列和右边序列起始索引
        while (j <= mid && k <= high) {
            if (arr[j] < arr[k]) {
                temp[i++] = arr[j++];
            } else {
                temp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进temp[]中
        while (j <= mid) {
            temp[i++] = arr[j++];
        }
        //若右边序列还有剩余，则将其全部拷贝进temp[]中
        while (k <= high) {
            temp[i++] = arr[k++];
        }
        // i = high - low + 1
        //因为temp的数据一直是从0开始的
        //右区间中有序的部分要根据low的值进行偏移，偏移量即为 low + t
        //最难理解的就是最后这一步，想了很久
        for (int t = 0; t < i; t++) {
            arr[low + t] = temp[t];
        }
        System.out.println(Arrays.toString(arr));
    }
}
