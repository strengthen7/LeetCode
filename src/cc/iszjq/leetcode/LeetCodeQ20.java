package cc.iszjq.leetcode;

public class LeetCodeQ20 {

    public static void main(String[] args) {
        LeetCodeQ20 leetCodeQ20 = new LeetCodeQ20();
        System.out.println(leetCodeQ20.isValid("{[]}"));
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
