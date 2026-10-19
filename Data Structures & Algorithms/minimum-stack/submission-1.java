class MinStack {
	Stack<List<Integer>> stack ;
	
	public MinStack() {
		stack = new Stack<>();
    }
    
    public void push(int val) {
    	stack.push(Arrays.asList(val,Math.min((!stack.isEmpty()? stack.peek().get(1) : Integer.MAX_VALUE), val)));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().get(0);
    }
    
    public int getMin() {
    	return stack.peek().get(1);
    }
}
