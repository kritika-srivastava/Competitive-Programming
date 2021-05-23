/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-1/Add_two_Numbers.java
 * 
 * @author Kritika Srivastava
 * @since May 23, 2021
 *
 *        Description: You are given two non-empty linked lists representing two
 *        non-negative integers. The digits are stored in reverse order, and
 *        each of their nodes contains a single digit. Add the two numbers and
 *        return the sum as a linked list. Link -
 *        https://leetcode.com/problems/add-two-numbers/
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Add_two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode p = l1, q = l2, ret1 = ret;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            ret.next = new ListNode(sum % 10);
            ret = ret.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            ret.next = new ListNode(carry);
        }
        return ret1.next;

    }
}