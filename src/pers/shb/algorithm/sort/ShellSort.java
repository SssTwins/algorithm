package pers.shb.algorithm.sort;

/**
 * 希尔排序
 * 时间复杂度O(n log n)，最好情况O(n)，最坏情况O(n log² n)，空间复杂度O(1)，排序方式In-place，不稳定排序
 *
 * @author SHB
 * @date 2020年11月9日 10:10:38
 */
public class ShellSort {
    /**
     * 希尔排序实现
     * @param nums 整型数组
     * @return 原数组
     */
    public static int[] shellSortImpl(int[] nums){
        int len = nums.length;
        int tmp , gap = len>>1;
        while (gap>0){
            for(int i = gap;i<len;i++){
                tmp = nums[i];
                int preIndex = i-gap;
                while (preIndex >= 0 && nums[preIndex] > tmp) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex -= gap;
                }
                nums[preIndex+gap] = tmp;
            }
            gap>>=1;
        }
        return nums;
    }
}
