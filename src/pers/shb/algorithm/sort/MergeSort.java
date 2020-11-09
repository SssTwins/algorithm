package pers.shb.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 平均时间复杂度O(n log n)，最好情况O(n log n)，最坏情况O(n log n)，空间复杂度O(n)，排序方式Out-place，稳定排序
 *
 * @author SHB
 * @date 2020年11月9日 10:44:06
 */
public class MergeSort {

    /**
     * 归并排序实现，进行合并递归调用
     * @param nums 整型数组
     * @return 原数组
     */
    public static int[] mergeSortImpl(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int mid = nums.length >> 1;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        return merge(mergeSortImpl(left), mergeSortImpl(right));
    }

    /**
     * 数组合并方法
     * @param left 左数组
     * @param right 右数组
     * @return 合并后数组
     */
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }
}
