package tech.strengthen.learn.leetcode.everyday;

import java.util.Scanner;

/**
 * 有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，5，7，9，15，21
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/get-kth-magic-number-lcci">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * input:5
 * output:9
 * --
 * 解体思路：<a href="https://leetcode.cn/problems/get-kth-magic-number-lcci/solution/by-7hao-d1vl/">...</a>
 */
public class D0928NumK {

    public int getKthMagicNumber(int k) {
        int n3 = 0, n5 = 0, n7 = 0;
        int[] resultArr = new int[k + 1];
        resultArr[0] = 1;
        for (int i = 1; i < k; i++) {
            resultArr[i] = Math.min(Math.min(resultArr[n3] * 3, resultArr[n5] * 5), resultArr[n7] * 7);
            if (resultArr[i] % 3 == 0) n3++;
            if (resultArr[i] % 5 == 0) n5++;
            if (resultArr[i] % 7 == 0) n7++;

        }
        return resultArr[k - 1];
    }

    public static void main(String[] args) {
        D0928NumK d0928NumK = new D0928NumK();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int k = scanner.nextInt();
            System.out.println(d0928NumK.getKthMagicNumber(k));
        }
    }
}
