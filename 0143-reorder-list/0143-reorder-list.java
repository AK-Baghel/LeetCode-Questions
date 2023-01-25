class Solution {
    public void reorderList(ListNode head) {
        
        //Step 1 - finding mid
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode mid=slow;

        //Reversing right part
        ListNode prev=null;
        ListNode curr=mid.next;
        mid.next=null;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //Making Left & Right Head
        ListNode right=prev;
        ListNode left=head;
        ListNode nextLeft,nextRight;

        while(right!=null && left!=null){
            nextLeft=left.next;
            left.next=right;
            nextRight=right.next;
            right.next=nextLeft;

            left=nextLeft;
            right=nextRight;
        }
    }
}