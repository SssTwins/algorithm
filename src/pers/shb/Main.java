package pers.shb;

import java.util.*;

/**
 * @author SHB
 */
public class Main {
    
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '0', '0'},
                {'1', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '1'},
                {'0', '0', '1', '1', '1'}
        };
        System.err.println(numIslands(grid, 6));
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = merge(nums1, nums2);
        int len = result.length;
        double res;
        if (len % 2 == 0) {
            res = (result[len / 2] + result[len / 2 - 1]) / 2;
        } else {
            res = result[len / 2];
        }
        return res;
    }
    
    public static int[] merge(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1 + len2];
        int p = len1-- + len2-- - 1;
        while (len1 >= 0 && len2 >= 0) {
            result[p--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        while (len1 >= 0) {
            result[p--] = nums1[len1--];
        }
        while (len2 >= 0) {
            result[p--] = nums2[len2--];
        }
        return result;
    }
    
    /**
     * 广度优先搜索判断岛屿数量
     *
     * @param grid 二维数组
     * @param s    预计岛屿面积
     * @return 等于面积的岛屿数量
     */
    public static int numIslands(char[][] grid, int s) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        //定义临时变量存储岛屿面积
        int islandArea = 0;
        int islandNumber = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid[r][c] == '1') {
                    islandArea++;
                    grid[r][c] = '0';
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(r * col + c);
                    while (!queue.isEmpty()) {
                        int id = queue.remove();
                        int tmpRow = id / col;
                        int tmpCol = id % col;
                        if (tmpRow - 1 >= 0 && grid[tmpRow - 1][tmpCol] == '1') {
                            queue.add((tmpRow - 1) * col + tmpCol);
                            islandArea++;
                            grid[tmpRow - 1][tmpCol] = '0';
                        }
                        if (tmpRow + 1 < row && grid[tmpRow + 1][tmpCol] == '1') {
                            queue.add((tmpRow + 1) * col + tmpCol);
                            islandArea++;
                            grid[tmpRow + 1][tmpCol] = '0';
                        }
                        if (tmpCol - 1 >= 0 && grid[tmpRow][tmpCol - 1] == '1') {
                            queue.add((tmpRow) * col + tmpCol - 1);
                            islandArea++;
                            grid[tmpRow][tmpCol - 1] = '0';
                        }
                        if (tmpCol + 1 < col && grid[tmpRow][tmpCol + 1] == '1') {
                            queue.add((tmpRow) * col + tmpCol + 1);
                            islandArea++;
                            grid[tmpRow][tmpCol + 1] = '0';
                        }
                    }
                    if (islandArea == s) {
                        islandNumber++;
                    }
                    //一个岛屿判断完成后将岛屿面积重置
                    islandArea = 0;
                }
                
            }
        }
        return islandNumber;
    }
}
