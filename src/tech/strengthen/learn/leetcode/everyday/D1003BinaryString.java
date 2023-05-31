package tech.strengthen.learn.leetcode.everyday;

public class D1003BinaryString {

    public boolean checkOnesSegment(String s) {
        return !s.contains("01") || !s.contains("10");
    }

    public static void main(String[] args) {
        D1003BinaryString d1003BinaryString = new D1003BinaryString();
        System.out.println(d1003BinaryString.checkOnesSegment("10"));
    }
}
