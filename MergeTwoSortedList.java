/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null)
            return l2;
        
        if(l2 == null)
            return l1;
        
        ListNode dummy = new ListNode(0);
        
        ListNode result = dummy;
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                dummy.next = new ListNode(l1.val);
                dummy = dummy.next;
                l1 = l1.next;
            }else {
                dummy.next = new ListNode(l2.val);
                dummy = dummy.next; 
                l2 = l2.next;
            }    
        }
        
        if(l1 != null && l2 == null){
            dummy.next = l1;
            dummy = dummy.next;
        }
        
        if(l1 == null && l2 != null){
            dummy.next = l2;
            dummy = dummy.next;
        }
        return result.next;
    }
}