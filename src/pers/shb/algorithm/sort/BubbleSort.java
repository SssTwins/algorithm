package pers.shb.algorithm.sort;

/**
 * 冒泡排序
 * 平均时间复杂度O(n²)，最好情况O(n)，最坏情况O(n²)，空间复杂度O(1)，排序方式In-place，稳定排序
 *
 * @author SHB
 * @date 2020年11月9日 09:26:17
 */
public class BubbleSort {

    /**
     * 冒泡排序实现，升序排列
     *
     * @param nums 整型数组
     * @return 原数组
     */
    public static int[] bubbleSortImpl(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
