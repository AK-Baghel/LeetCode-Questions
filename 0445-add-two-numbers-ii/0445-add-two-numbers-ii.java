class Solution {

    public ListNode reverse(ListNode ll){
        ListNode prev=null;
        ListNode curr=ll;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ll1=reverse(l1);
        ListNode ll2=reverse(l2);

       
        ListNode ll=new ListNode(-1);
        ListNode head=ll;
        int total,carry=0;
        while(ll1!=null && ll2!=null){
            total=ll1.val + ll2.val + carry;
            carry=0;
            if(total>=10){
                ll.next=new ListNode(total%10);
                carry=1;
            }
            else{
                ll.next=new ListNode(total);
            }
            ll=ll.next;
            ll1=ll1.next;
            ll2=ll2.next;
            System.out.println(l1.val);
        }
        // System.out.println(l1.val);
        while(ll1!=null){
            total=ll1.val+carry;
            carry=0;
             if(total>=10){
                ll.next=new ListNode(total%10);
                carry=1;
            }
            else{
                ll.next=new ListNode(total);
            }
            ll=ll.next;
            ll1=ll1.next;
        }
        while(ll2!=null){
            total=ll2.val+carry;
            carry=0;
             if(total>=10){
                ll.next=new ListNode(total%10);
                carry=1;
            }
            else{
                ll.next=new ListNode(total);
            }
            ll=ll.next;
            ll2=ll2.next;
        }


        if(carry==1){
            ll.next=new ListNode(carry);
        }

        
        return reverse(head.next);
    }
}