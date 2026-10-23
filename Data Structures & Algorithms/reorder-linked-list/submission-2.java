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
    public void reorderList(ListNode head) {
		//Calculate length
		int n = 0;
		ListNode temp = head;
		while(temp!=null) {
			n++;
			temp = temp.next;
		}
		temp =head;
		for(int i=0; i<(n/2); i++) {
			temp = temp.next;
		}
		
		ListNode rev = reverseList(temp);
		
		ListNode l = head;
		
		while(l!=rev) {
			ListNode tmp = l.next;
			if(rev.next == null) {
				break;
			}
			ListNode tmp2 = rev.next;
			l.next = rev;
			rev.next= tmp;
			l = tmp;
			rev= tmp2;
		}
    }
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		
		while(head != null) {
			ListNode temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		
		return prev;
	}

}
