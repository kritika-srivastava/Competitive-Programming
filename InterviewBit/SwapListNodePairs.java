/**
 * Link  - https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class SwapListNodePairs {
    public ListNode swapPairs(ListNode A) {
        ListNode B= A;
        while(A.next!=null)
        {
            int data=A.val;
            A.val=A.next.val;
            A.next.val=data;
            if(A.next.next!=null)
            {
            A=A.next.next;
            }
            else
            {A=A.next;}
        }
       
        return B;
    }
}
