class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a=head;
        int size=0;
        while(a!=null){
            size++;
            a=a.next;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        ListNode b=head;
        int n1=size-n;
        int i=1;
        while(i<n1){
            b=b.next;
            i++;
        }
        b.next=b.next.next;
        return head;
    }
}