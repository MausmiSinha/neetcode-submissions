class LRUCache {

		class Node {
	    int val;
	    int key;
	    Node next;
	    Node prev;
	    Node(int key, int val) { this.key = key; this.val = val; }
	}
	
	Node head = new Node(-1, -1);
	Node tail = new Node(-1, -1);
	HashMap<Integer,Node> map = new HashMap<>();
	int limit;

	public LRUCache(int capacity) {
		limit = capacity;
		head.next = tail;
		tail.prev = head;
        
    }
    
    public int get(int key) {
    	if (!map.containsKey(key)) {
            return -1;
        }
        
        Node node = map.get(key);
        removeNode(node); 
        addNode(node); 
        return node.val; 
        
    }
    
    public void put(int key, int value) {
    	if(map.containsKey(key)) {
    		Node oldNode = map.get(key);
    		removeNode(oldNode);
    		map.remove(key);
    	}
    	
    	if(map.size() == limit) {
    		Node nodeToRemove = tail.prev;
    		removeNode(nodeToRemove);
    		map.remove(nodeToRemove.key);
    	}
    	Node newNode = new Node(key, value);

    	addNode(newNode);
    	map.put(key, newNode);
        
    }
    
    public void removeNode(Node node) {
    	Node oldPrev = node.prev;
    	Node oldNext = node.next;
    	oldPrev.next = oldNext;
    	oldNext.prev = oldPrev;

    }
    
    public void addNode(Node node) {
    	Node oldNext = head.next;
    	head.next = node;
    	oldNext.prev = node;
    	node.next = oldNext;
    	node.prev = head;
    	
    }
}
