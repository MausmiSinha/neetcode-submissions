class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<Integer>();
		 
		 for(int i=0; i<tokens.length; i++) {
			  if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")
		                || tokens[i].equals("/")) {
				  int x = stack.pop();
					 int y = stack.pop();
					 if(tokens[i].equals("+")) {
						 stack.push(y+x);
					 }else if(tokens[i].equals("*")) {
						 stack.push(x*y);
					 }else if(tokens[i].equals("-")) {
						 stack.push(y-x);
					 }else if(tokens[i].equals("/")) {
						 stack.push(y/x);
					 }
			  }
			
			 else {
				 stack.push(Integer.parseInt(tokens[i]));
			 }
		 }
		 
		 return stack.peek();
    }
}
