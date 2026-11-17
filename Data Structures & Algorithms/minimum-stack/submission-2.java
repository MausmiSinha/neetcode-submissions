class MinStack {

    Stack<Integer> stack ;
	
	PriorityQueue<Integer> pq ;

	  	public MinStack() {
	  		stack = new Stack<Integer>();
	  		pq = new PriorityQueue<>();
	        
	    }
	    
	    public void push(int val) {
	    	
	    	stack.push(val);
	    	pq.add(val);
	        
	    }
	    
	    public void pop() {
	    	
	    	int removed = stack.pop();
	    	pq.remove(removed); 
	        
	    }
	    
	    public int top() {
	    	return stack.peek();
	        
	    }
	    
	    public int getMin() {
	    	  return pq.peek();
	    }
}
