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
    public ListNode removeNthFromEnd(ListNode head, int n) {

         ListNode temp = head;
        int size = 0;
        while(temp!=null) {
			size++;
			temp = temp.next;
		}
        temp = head;
        int idx = size-n;
        if(idx ==0) return head.next;

        ListNode prev = head, curr = head;
        for(int i=0;prev!=null && curr != null && i<idx; i++) {
        	prev=curr;
        	curr = curr.next;
        }
        prev.next= curr.next;
        return head;

    }
}
