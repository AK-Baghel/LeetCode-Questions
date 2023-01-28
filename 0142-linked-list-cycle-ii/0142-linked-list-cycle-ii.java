public class Solution {
    public ListNode detectCycle(ListNode head) {

        boolean flag=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(flag == false)
            return null;
        
        slow=head;
        ListNode prev=null;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}