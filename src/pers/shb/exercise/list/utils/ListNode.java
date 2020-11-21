package pers.shb.exercise.list.utils;

/**
 * 简易链表节点类
 *
 * @author SHB
 * @date 2020年11月21日 11:27:50
 */
public class ListNode {
    
    public int val;
    public ListNode next;
    
    ListNode() {
    }
    
    public ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
