package pers.shb.exercise.list.medium;

import pers.shb.exercise.list.easy.MergeTwoSortedLists;
import pers.shb.exercise.list.utils.ListNode;

import java.util.List;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 * 示例 1：
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 示例 2：
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 *
 * @author SHB
 * @date 2020年11月21日 11:14:10
 */
public class SortList {
    
    public static ListNode sortList(ListNode head) {
        return sortList(head, null);
    }
    
    /**
     * 归并排序链表，原理和归并排序数组相同
     *
     * @param head 头结点
     * @param tail 尾节点
     * @return 合并后的链表头结点
     */
    private static ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return head;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode fast = head, slow = head;
        while (fast != tail) {
            fast = fast.next;
            slow = slow.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        return MergeTwoSortedLists.mergeTwoLists(list1, list2);
    }
}
