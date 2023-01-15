class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list1=head;
        int size=0;
        while(list1!=null){
            size++;
            list1=list1.next;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        ListNode list2=head;
        int n1=size-n;
        int i=1;
        while(i<n1){
            list2=list2.next;
            i++;
        }
        list2.next=list2.next.next;
        return head;
    }
}