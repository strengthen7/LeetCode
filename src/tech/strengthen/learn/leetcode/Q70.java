package tech.strengthen.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q70 {

    public static void main(String[] args) {
        Q70 q70 = new Q70();
        System.out.println(q70.climbStairs(45));
    }

    //使用Map缓存重复的计算结果，否则会 Out Time
    Map<Integer, Integer> nStepMap = new HashMap<>();

    //主要是需要理解递推的思想
    //递推如何递出去(子问题分解)，推回来(叠加问题结果)
    //终止条件该如何考虑(终止问题的边界条件)
    //递推过程中难免会出现重复，可以通过map记录避免重复计算的成本
    //递推需要谨防方法栈溢出、陷入无限循环的问题。
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        Integer result = nStepMap.get(n);
        if (result == null) {
            result = climbStairs(n - 1) + climbStairs(n - 2);
            nStepMap.put(n, result);
        }
        return result;
    }
}
