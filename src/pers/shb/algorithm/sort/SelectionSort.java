package pers.shb.algorithm.sort;

/**
 * 选择排序
 * 平均时间复杂度O(n²)，最好情况O(n²)，最坏情况O(n²)，空间复杂度O(1)，排序方式In-place，不稳定排序
 *
 * @author SHB
 * @date 2020年11月9日 09:39:55
 */
public class SelectionSort {

    /**
     * 选择排序实现，升序排列
     *
     * @param nums 整型数组
     * @return 原数组
     */
    public static int[] selectionSortImpl(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;
        }
        return nums;
    }
}
