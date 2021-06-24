/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/remove_nth_node_from_end_of_list.java
 * 
 * @author Kritika Srivastava
 * @since June 24, 2021
 *
 *        Description - Given the head of a linked list, remove the nth node
 *        from the end of the list and return its head.
 * 
 *        Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class remove_nth_node_from_end_of_list {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode curr = d;
        ListNode prev = d;
        for (int i = 0; i <= n; i++) {
            curr = curr.next;
        }
        while (curr != null) {
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return d.next;
    }
}
