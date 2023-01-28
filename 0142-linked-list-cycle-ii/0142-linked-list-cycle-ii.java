public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //Checking LINKEDlist is Cyclic or not
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
        
        //if flag ==false, means LinkedList is not cyclic
        if(flag == false)
            return null;
        
        //finding the meeting point where slow & fast will meet
        slow=head;
        ListNode prev=null;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}