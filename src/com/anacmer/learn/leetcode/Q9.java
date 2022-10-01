package com.anacmer.learn.leetcode;

public class Q9 {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        Q9 q9 = new Q9();
        System.out.println(q9.isPalindrome(-1));
    }
}
