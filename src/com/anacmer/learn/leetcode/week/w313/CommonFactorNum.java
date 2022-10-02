package com.anacmer.learn.leetcode.week.w313;

public class CommonFactorNum {

    public int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CommonFactorNum commonFactorNum = new CommonFactorNum();
        System.out.println(commonFactorNum.commonFactors(12, 6));
    }
}
