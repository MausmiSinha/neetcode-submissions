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
		ListNode r = rev;
		
		while(l!=r) {
			ListNode tmp = l.next;
			if(r.next == null) {
				break;
			}
			ListNode tmp2 = r.next;
			l.next = r;
			r.next= tmp;
			l = tmp;
			r= tmp2;
		}
    }
	
	public ListNode reverseList(ListNode head) {

		ListNode curr = head;
		ListNode prev = null;
		
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		return prev;
	}

}
