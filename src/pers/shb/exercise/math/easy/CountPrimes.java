package pers.shb.exercise.math.easy;

/**
 * 计数质数
 * <p>
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 示例 2：
 * <p>
 * 输入：n = 0
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：n = 1
 * 输出：0
 *
 * @author SHB
 * @date 2020年12月3日 21:52:53
 */
public class CountPrimes {
    
    /**
     * 统计所有小于非负整数 n 的质数的数量。
     *
     * @param n
     * @return 质数数量
     */
    public int countPrimesImpl(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            result += isPrime(i) ? 1 : 0;
        }
        return result;
    }
    
    /**
     * 遍历数字判断此数是否是质数
     * @param x
     * @return
     */
    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
