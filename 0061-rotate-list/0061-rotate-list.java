
// https://youtu.be/L4SpbpKUN9A

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        int count=1;
        ListNode ll=head;
        while(ll.next!=null){
            count++;
            ll=ll.next;
        }
        
        ll.next=head;
        
        ListNode prev=null;
        ll=head;
        
        k=count-(k%count);
        
        while(k>0)
        {
            prev=ll;
            ll=ll.next;
            k--;
        }
        prev.next=null;
        
        return ll;        
    }
}
