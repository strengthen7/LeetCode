package tech.strengthen.learn.leetcode.everyday;

public class D1004MinValidParentheses {

    public int minAddToMakeValid(String s) {
        while (s.contains("()")) {
            s = s.replaceAll("\\(\\)", "");
        }
        return s.length();
    }

    public static void main(String[] args) {
        D1004MinValidParentheses d1004MinValidParentheses = new D1004MinValidParentheses();
        System.out.println(d1004MinValidParentheses.minAddToMakeValid("(()))"));
    }
}
