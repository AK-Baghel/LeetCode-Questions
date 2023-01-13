class Solution {
    public boolean isPalindrome(ListNode head) {
        
        //Checking for empty and 1 size of LinkedList 
        if(head==null || head.next==null)
            return true;
        
        //Finding Mid of LinkedList
        ListNode mid;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;

        //Reversing the Right part of LinkedList from Mid 
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        ListNode right=prev;
        ListNode left=head;
        
        //Compairing Left and Right part values of LinkedList
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}