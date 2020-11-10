package pers.shb.exercise.string;

/**
 * 把数字翻译成字符串
 * 提供一种将字母编码成字符串的方式
 * a->1，b->2，c->3...z->26
 * 现在给出一串数字，返回有多少种可能的编码结果
 *
 * @author SHB
 * @date 2020年11月10日 09:58:30
 */
public class DigitalToString {
    /**
     * 动态规划解题，主要在对0和10的判断
     *
     * @param nums 数字的字符串
     * @return 整型数字
     */
    public static int digitalToString(String nums) {
        //判断字符串是否合法，根据题义，单个数字为0不合法
        if (nums == null || nums.length() == 0 || nums.charAt(0) == '0') {
            return 0;
        }
        int len = nums.length();
        if (len == 1) {
            return 1;
        }
        //此时经过判断已知字符串最少有两位
        String start = nums.substring(0, 2);
        Integer startNum = Integer.valueOf(start);
        if (len > 2) {
            if (startNum > 26) {
                //大于26则数字必然取单位转换，递归字符串
                return digitalToString(nums.substring(1));
            } else {
                return digitalToString(nums.substring(1))+digitalToString(nums.substring(2));
            }
        } else {
            //此分支则字符串正好两位
            if (startNum > 26 || nums.charAt(1) == '0') {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
