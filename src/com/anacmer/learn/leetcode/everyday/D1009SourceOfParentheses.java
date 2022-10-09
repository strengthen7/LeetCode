package com.anacmer.learn.leetcode.everyday;


public class D1009SourceOfParentheses {

    public int scoreOfParentheses(String s) {
        int bal = 0, n = s.length(), res = 0;
        for (int i = 0; i < n; i++) {
            bal += (s.charAt(i) == '(' ? 1 : -1);
            if (s.charAt(i) == ')' && s.charAt(i - 1) == '(') {
                res += 1 << bal;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        D1009SourceOfParentheses d1007MaxSubArraySum = new D1009SourceOfParentheses();
        System.out.println((d1007MaxSubArraySum.scoreOfParentheses("(()(()))")));
    }
}
