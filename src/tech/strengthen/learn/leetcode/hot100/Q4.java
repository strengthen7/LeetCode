package tech.strengthen.learn.leetcode.hot100;

public class Q4 {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int halfLength = totalLength / 2;
        int[] result = new int[totalLength];
        merge(nums1, nums2, result);
        if (totalLength % 2 == 0) {
            return (result[halfLength] + result[halfLength - 1]) / 2d;
        } else {
            return result[halfLength];
        }
    }

    public void merge(int[] nums1, int[] nums2, int[] result) {
        int k = 0;
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                result[k++] = nums1[i--];
            } else {
                result[k++] = nums2[j--];
            }
        }
        while (i >= 0) {
            result[k++] = nums1[i--];
        }
        while (j >= 0) {
            result[k++] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        // 虽然提交过了，但是没满足 O(log(m+n))复杂度要求看劈叉了。
        Q4 q4 = new Q4();
        double medianSortedArrays = q4.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(medianSortedArrays);
    }
}
