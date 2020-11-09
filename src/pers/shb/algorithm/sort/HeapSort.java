package pers.shb.algorithm.sort;


/**
 * 堆排序
 * 平均时间复杂度O(n log n)，最好情况O(n log n)，最坏情况O(n log n)，空间复杂度依O(1)，排序方式In-place，不稳定排序
 *
 * @author SHB
 */
public class HeapSort {

    /**
     * 堆排序实现
     *
     * @param nums 整型数组
     */
    public static void heapSortImpl(int[] nums) {
        int len = nums.length;
        int beginIndex = (len >> 1) - 1;
        for (int i = beginIndex; i >= 0; i--) {
            maxHeap(nums, i, len - 1);
        }
        for (int i = len-1; i > 0; i--) {
            swap(nums, 0, i);
            maxHeap(nums, 0, i - 1);
        }
    }

    /**
     * 创建大顶堆，对应升序排序
     *
     * @param nums     目标数组
     * @param i        元素索引
     * @param maxIndex 未排序数组部分的最大下标
     */
    private static void maxHeap(int[] nums, int i, int maxIndex) {
        int left = (i << 1) + 1;
        int right = left + 1;
        int currentMaxIndex = left;
        if (currentMaxIndex > maxIndex) {
            return;
        }
        if (right <= maxIndex && nums[right] > nums[left]) {
            currentMaxIndex = right;
        }
        if (nums[i] < nums[currentMaxIndex]) {
            swap(nums, currentMaxIndex, i);
            maxHeap(nums, currentMaxIndex, maxIndex);
        }
    }

    /**
     * 交换数组中的两个元素
     *
     * @param nums 目标数组
     * @param i    元素一
     * @param j    元素二
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
