/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\Add_two_Numbers.java
 * @author Kritika Srivastava
 * @since December 19, 2024
 *
 * Link: https://leetcode.com/problems/add-two-numbers/
 */
class Add_two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;

        ListNode ans=new ListNode(0,null);
        ListNode curr=ans;

        while(l1!=null && l2!=null){
            int val=(l1.val+l2.val+carry)%10;
            curr.next=new ListNode(val,null);
            curr=curr.next;
            carry=(l1.val+l2.val+carry)/10;
            l1=l1.next;
            l2=l2.next;
            
        }

        while(l1!=null){
            int val=(l1.val+carry)%10;
            curr.next=new ListNode(val,null);
            curr=curr.next;
            carry=(l1.val+carry)/10;
            l1=l1.next;
        }
        while(l2!=null){
            int val=(l2.val+carry)%10;
            curr.next=new ListNode(val,null);
            curr=curr.next;
            carry=(l2.val+carry)/10;
            l2=l2.next;
        }

        if(carry!=0){
            curr.next=new ListNode(carry,null);
        }


        return ans.next;

    }
}