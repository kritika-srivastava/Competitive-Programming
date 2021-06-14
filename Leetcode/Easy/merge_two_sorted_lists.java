/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/merge_two_sorted_lists.java
 * @author Kritika Srivastava
 * @since June 14, 2021
 *
 * Description - Merge two sorted linked lists and return it as a sorted list. 
 * The list should be made by splicing together the nodes of the first two lists.
 * 
 * Link - https://leetcode.com/problems/merge-two-sorted-lists/
 */
/**
 * Definition for singly-linked list. 
 * public class ListNode { int val; 
 * ListNode next; 
 * ListNode() {} 
 * ListNode(int val) 
 * { this.val = val; } 
 * ListNode(int val,ListNode next) 
 * { this.val = val; 
 *   this.next = next; 
 * } 
 * }
 */
class merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l4 = new ListNode(0);
        ListNode l3 = l4;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            l3.next = l1;
        } else {
            l3.next = l2;
        }
        return l4.next;
    }

}
