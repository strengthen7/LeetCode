package com.anacmer.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    /*
    Z 字形变换
    P   A   H   N
    A P L S I I G
    Y   I   R

    变成竖型，然后横着读输出
    flag 用的真牛逼
     */
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }

    public static void main(String[] args) {
        Q6 q6 = new Q6();
        q6.convert("PAYPALISHIRING", 3);
    }
}
