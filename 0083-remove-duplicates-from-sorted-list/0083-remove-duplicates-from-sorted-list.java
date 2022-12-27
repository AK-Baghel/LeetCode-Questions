class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ll=head;
        while(ll !=null && ll.next !=null){
            if (ll.next == null) {
        		 break;
        	 }
            if(ll.val==ll.next.val){
                ll.next=ll.next.next;
            }
            else{
                ll=ll.next;
            }    
        }
        return head;
    }
}