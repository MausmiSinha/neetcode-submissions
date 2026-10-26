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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        int n = 0;
        while(curr!=null) {
        	n++;
        	curr = curr.next;
        }
    
        
        for(int i=0; i<n-1; i++) {
            curr = head;
            for (int j = 0; j < n - 1 - i; j++) {
                if (curr.val > curr.next.val) {
                    int tempVal = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = tempVal;
                }
        	curr = curr.next;
        }
        }


        return head;

    }
}
