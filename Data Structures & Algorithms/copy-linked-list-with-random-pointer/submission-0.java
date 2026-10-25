/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
	public Node copyRandomList(Node head) {
		if(head == null) return null;
		HashMap<Node, Node> map = new HashMap<>();
		
		Node oldNode = head;
		Node newNode = null;
		Node newHead = null;
		while(oldNode != null) {
			if(newHead == null) {
				newHead = new Node(oldNode.val);
				newNode = newHead;
			}else {
				Node temp = new Node(oldNode.val);
				newNode.next = temp;
				newNode = temp;
			}
			map.put(oldNode, newNode);
			oldNode = oldNode.next;
		}
		
		oldNode = head;
		newNode = newHead;
		
		while(oldNode != null) {
			newNode.random = map.getOrDefault(oldNode.random, null);
			oldNode = oldNode.next;
			newNode = newNode.next;
		}
		
        return newHead;
    }
}
