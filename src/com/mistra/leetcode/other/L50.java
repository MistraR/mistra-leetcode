package com.mistra.leetcode.other;

/**
 * 实现pow(x, n)，即计算 x 的整数n 次幂函数（即，xn ）。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 *
 * @author mistra@future.com
 * @date 2023/3/12
 */
public class L50 {

    public static void main(String[] args) {
        System.out.println(myPow(0, 1));
    }

    public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n > 0 ? pow(x, n) : 1.0d / pow(x, n);
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double tmp = pow(x, n / 2);
        return n % 2 == 0 ? tmp * tmp : tmp * tmp * x;
    }
}
