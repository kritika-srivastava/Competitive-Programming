/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-3/LinkedList_Cycle.java
 * 
 * @author Kritika Srivastava
 * @since May 27, 2021
 *
 *        Description - Given head, the head of a linked list, determine if the
 *        linked list has a cycle in it.
 * 
 *        There is a cycle in a linked list if there is some node in the list
 *        that can be reached again by continuously following the next pointer.
 *        Internally, pos is used to denote the index of the node that tail's
 *        next pointer is connected to. Note that pos is not passed as a
 *        parameter.
 * 
 *        Return true if there is a cycle in the linked list. Otherwise, return
 *        false. Link - https://leetcode.com/problems/linked-list-cycle/
 */

//Definition for singly-linked list.
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LinkedList_Cycle {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> map = new HashMap<ListNode, Boolean>();
        while (true && head != null) {
            if (map.containsKey(head)) {
                return true;
            } else {
                map.put(head, true);
                head = head.next;
            }
        }
        return false;
    }
}
