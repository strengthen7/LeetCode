package com.anacmer.learn.leetcode;

public class Q20 {

    public static void main(String[] args) {
        Q20 q20 = new Q20();
        System.out.println(q20.isValid("{[]}"));
    }

    public boolean isValid(String s) {
        String big = "{}";
        String mid = "[]";
        String small = "()";
        while (s.contains(big) || s.contains(mid) || s.contains(small)) {
            s = s.replace(big, "");
            s = s.replace(mid, "");
            s = s.replace(small, "");
        }
        return s.length() == 0;
    }
}
