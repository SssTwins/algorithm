package pers.shb.exercise.list.easy;

import pers.shb.exercise.list.utils.ListNode;

/**
 * 回文链表
 * <p>
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 *
 * @author SHB
 * @date 2020年11月25日 17:41:29
 */
public class PalindromeLinkedList {
    
    public static boolean isPalindrome(ListNode head) {
        boolean result = true;
        if (head == null) return true;
        ListNode mid = getMid(head);
        ListNode reverse = ReverseLinkedList.reverseList(mid.next);
        ListNode p1 = head;
        ListNode p2 = reverse;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        mid.next = ReverseLinkedList.reverseList(mid);
        return result;
    }
    
    /**
     * 快慢指针法获取链表中点
     *
     * @param head
     * @return
     */
    private static ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
