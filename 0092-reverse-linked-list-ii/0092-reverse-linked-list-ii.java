class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       
        if(head==null || left==right){
            return head;
        }

        Stack <Integer> st=new Stack<>();
        ListNode ll=head;

        int n=1;
        while(ll!=null){
            if(n>=left && n<=right){
                st.push(ll.val);
            }
            ll=ll.next;
            n++;
        }

        ll=head;
        int i=0;
        n=1;
        while(ll!=null){
            if(n>=left && n<=right){
                ll.val=st.pop();
                i++;
            }
            ll=ll.next;
            n++;
        }
        return head;
    }
}