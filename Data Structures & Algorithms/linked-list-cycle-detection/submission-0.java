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
    public boolean hasCycle(ListNode head) {
		if(head == null) return false;
		ListNode l =head;
		ListNode r =head;
		while(r != null && r.next != null) {
			r = r.next.next; 
			if(l == r) return true;
			l = l.next;
		}
		return false;
        
    }
}
