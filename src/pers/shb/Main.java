package pers.shb;

import pers.shb.exercise.list.medium.SortList;
import pers.shb.exercise.list.utils.ListNode;

import java.util.*;

/**
 * @author SHB
 */
public class Main {
    
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        
        ListNode head=SortList.sortList(listNode);
        while (head!=null){
            System.err.println(head.val);
            head = head.next;
        }
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
