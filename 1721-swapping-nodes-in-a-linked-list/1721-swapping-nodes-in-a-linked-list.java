class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        // if(k==1)
        //     return head;
        
        //Counting the Size of LinkedList
        int i=1,count=0;
        ListNode temp1=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        
        //Finding Node at distance k
        i=1;
        temp1=head;
        while(i!=k){
            i++;
            temp1=temp1.next;
        }
        
        //Finding Node from last at K distance
        i=1;
        ListNode temp2=head;
        while(i!=(count-k+1)){
            i++;
            temp2=temp2.next;
        }
        
        //Swapping temp1 & temp2 Node
        count=temp1.val;
        temp1.val=temp2.val;
        temp2.val=count;
        
        return head;
    }
}