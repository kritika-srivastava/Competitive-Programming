/**
 * Link - https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class DupList {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode n=A;
        while(A.next!=null)
        {
            if(A.val==A.next.val)
            {
                A.next=A.next.next;
            }
            else{
                A=A.next;
            }
            
        }
        return n;
    }
}
