public class AddTwoNumber{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return rec(l1,l2,0);
    }
    public ListNode rec(ListNode l1, ListNode l2,int carry){
        if(l1 == null && l2 == null){
            if(carry!=0)
            return new ListNode(carry);
        return null;
        }
        int a = l1 == null ? 0 : l1.val;
        int b = l2 == null ? 0 : l2.val;
        int sum = a + b + carry;
        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;
        if(sum>9){
            sum=sum%10;
            carry=1;
        }else{
            carry=0;
        }
        ListNode curr = new ListNode(sum);
        curr.next = rec(l1,l2,carry);
        return curr;
    }
}