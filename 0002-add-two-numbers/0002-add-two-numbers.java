class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode ll=head;
        int carry=0,total=0;
        while(l1!=null && l2!=null){
            total=l1.val+l2.val+carry;
            carry=0;
            if(total>=10){
                ll.next=new ListNode(total%10);
                carry=total/10;
            }
            else{
                ll.next=new ListNode(total);
            }
            ll=ll.next;
            
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            total=l1.val+carry;
            carry=0;
             if(total>=10){
                ll.next=new ListNode(total%10);
                carry=total/10;
            }
            else{
                ll.next=new ListNode(total);
            }
            ll=ll.next;
            
            l1=l1.next;
        }
        while(l2!=null){
            total=l2.val+carry;
            carry=0;
             if(total>=10){
                ll.next=new ListNode(total%10);
                carry=total/10;
            }
            else{
                ll.next=new ListNode(total);
            }
            ll=ll.next;
            
            l2=l2.next;
        }
        
        
        if(carry==1){
            ll.next=new ListNode(carry);
        }
        return head.next;
    }
}