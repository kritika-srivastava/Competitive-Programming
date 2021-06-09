/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Reverse_LinkedList.java
 * @author Kritika Srivastava
 * @since June 09, 2021
 *
 * Description - Reverse a linkedList
 * Link - https://leetcode.com/problems/reverse-linked-list/
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Reverse_LinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ret = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return ret;
    }
}
