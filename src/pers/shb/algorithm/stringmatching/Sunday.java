package pers.shb.algorithm.stringmatching;

/**
 * 字符串匹配Sunday算法
 *
 * @author SHB
 * @date 2020年11月10日 09:58:15
 */
public class Sunday {

    /**
     * sunday算法实现
     *
     * @param source 源字符串
     * @param match  匹配字符串
     * @return 匹配的字符下标
     */
    public static int strStr(String source, String match) {
        int m = source.length();
        int n = match.length();
        if (n < 1) {
            return 0;
        }
        int i = 0;
        int j = 0;
        while (i <= m - n) {
            while (j < n && match.charAt(j) == source.charAt(i + j)) {
                j++;
            }
            if (j == n) {
                return i;
            }
            if (i < m - n) {
                i += (n - lastIndex(match, source.charAt(i + n)));
            } else {
                return -1;
            }
            j = 0;
        }
        return -1;
    }

    /**
     * 计算下标位置
     *
     * @param str 匹配字符串
     * @param ch  字符
     * @return index
     */
    private static int lastIndex(String str, char ch) {
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) == ch) {
                return j;
            }
        }
        return -1;
    }
}
