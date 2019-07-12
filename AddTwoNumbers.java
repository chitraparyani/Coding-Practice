class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        
        ListNode result = dummy;
        
        int sum = 0, carry = 0;
        
        while(l1 != null || l2 != null){
            
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            
            sum = val1 + val2 + carry;
            
            carry = sum/10;
            
            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
            
            if(l1 != null)
                l1 = l1.next;
            
            if(l2 != null)
                l2 = l2.next;            
            
        }
        
        if(carry > 0){
            dummy.next = new ListNode(carry);
            dummy = dummy.next;
        }
            return result.next;
    }
}