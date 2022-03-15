/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null)
            return true;
        
        ListNode mid = FindMid(head);
        ListNode last = Reverse(mid);
        ListNode curr = head;
        
        while(last!=null)
        {
            if(last.val != curr.val)
                return false;
            
            last = last.next;
            curr = curr.next;
        }
        
        return true;
        
    }
    
    public ListNode Reverse(ListNode node)
    {
        ListNode curr = node;
        ListNode prev = null;
        
        
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
    public ListNode FindMid(ListNode mid)
    {
        ListNode slow = mid;
        ListNode fast = mid;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;            
        }
        
        return slow;
    }
}