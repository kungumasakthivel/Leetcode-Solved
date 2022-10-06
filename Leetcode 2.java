class Solution {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2){
         ListNode dummy = new ListNode(0);
         ListNode curr = dummy;
         int carry= 0;
         while(l1!=null || l2!=null || carry!=0){
             int n1=(l1==null ? 0 : l1.val);
             int n2=(l2==null ? 0 : l2.val);
             int sum = carry+n1+n2;
             carry = sum/10;
             curr.next =new ListNode(sum%10);
             curr = curr.next;
             if(l1 != null) l1=l1.next;
             if(l2 != null) l2=l2.next;
         }
         return dummy.next;
     }
}
