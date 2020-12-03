package pers.shb.exercise.list.easy;

import pers.shb.exercise.list.utils.ListNode;

/**
 * 反转链表
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @author SHB
 * @date 2020年11月25日 17:32:54
 */
public class ReverseLinkedList {
    
    /**
     * @param head 链表头结点
     * @return 翻转后的链表头结点
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmp;
        }
        return prev;
    }
}
