package pers.shb.algorithm.sort;

/**
 * 快速排序
 * 平均时间复杂度O(n log n)，最好情况O(n log n)，最坏情况O(n²)，空间复杂度依O(log n)，排序方式In-place，不稳定排序
 *
 * @author SHB
 * @date 2020年11月9日 11:21:31
 */
public class QuickSort {

    /**
     * 快速排序实现，升序排列
     *
     * @param nums 整型数组
     * @param l    左边界
     * @param r    右边界
     */
    public static void quickSortImpl(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r, tmp = nums[l];
            while (i < j) {
                //找到第一个比索引i位置大的值
                while (i < j && nums[j] >= tmp) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] < tmp) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = tmp;
            quickSortImpl(nums, l, i - 1);
            quickSortImpl(nums, i + 1, r);
        }
    }
}
