package pers.shb.algorithm.sort;

/**
 * 插入排序
 * 平均时间复杂度O(n²)，最好情况O(n)，最坏情况O(n²)，空间复杂度O(1)，排序方式In-place，稳定排序
 *
 * @author SHB
 * @date 2020年11月9日 10:03:24
 */
public class InsertionSort {

    public static int[] insertionSortImpl(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int current;
        for (int i = 0; i < nums.length - 1; i++) {
            current = nums[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = current;
        }
        return nums;
    }
}
