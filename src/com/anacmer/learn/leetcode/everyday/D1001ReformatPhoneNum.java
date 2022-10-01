package com.anacmer.learn.leetcode.everyday;

import java.util.Scanner;

public class D1001ReformatPhoneNum {

    public String reformatNumber(String number) {
        number = number.replaceAll(" ", "").replaceAll("-", "");
        if (number.length() == 2) {
            return number;
        }
        char[] chars = number.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int strLength = chars.length;
        for (int i = 0; i < strLength; i += 3) {
            int remainNum = strLength - i;
            if (remainNum <= 4) {
                if (remainNum == 4) {
                    stringBuilder.append(chars[i++]);
                    stringBuilder.append(chars[i++]);
                    stringBuilder.append("-");
                    stringBuilder.append(chars[i++]);
                    stringBuilder.append(chars[i]);
                } else {
                    for (int j = 0; j < remainNum; j++) {
                        stringBuilder.append(chars[i + j]);
                    }
                }
            } else {
                for (int j = 0; j < remainNum && j < 3; j++) {
                    stringBuilder.append(chars[i + j]);
                }
                stringBuilder.append("-");
            }

        }
        String result = stringBuilder.toString();
        if (result.endsWith("-")) {
            return result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        D1001ReformatPhoneNum d1001ReformatPhoneNum = new D1001ReformatPhoneNum();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(d1001ReformatPhoneNum.reformatNumber(scanner.nextLine()));
        }
    }
}
