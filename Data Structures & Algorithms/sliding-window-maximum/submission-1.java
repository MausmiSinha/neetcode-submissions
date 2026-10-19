class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int[] res = new int[(nums.length)-k+1];
		Deque<Integer[]> dq = new ArrayDeque<>();
		
		//First Window
		for(int i=0; i<k; i++) {
			while(!dq.isEmpty() && dq.peekLast()[0] < nums[i]){
				dq.removeLast();
			}
			dq.addLast(new Integer[] {nums[i], i});
		}
		
		res[0] = dq.peekFirst()[0];
		
		int j=1;
		for(int i=k; i<nums.length; i++) {
			while(!dq.isEmpty() && dq.peekLast()[0] < nums[i]){
				dq.removeLast();
			}
			
			while(!dq.isEmpty() && dq.peekFirst()[1] < (i-k+1)) {
				dq.removeFirst();
			}
			dq.addLast(new Integer[] {nums[i], i});
			
			res[j++] = dq.peekFirst()[0];
		}
		return res;
    }

}
