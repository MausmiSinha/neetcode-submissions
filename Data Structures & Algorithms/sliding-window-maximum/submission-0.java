class Solution {
public int[] maxSlidingWindow(int[] nums, int k) {
		 if (nums == null || k <= 0) return new int[0];
		int[] res = new int[(nums.length)-k+1];
		int max = Integer.MIN_VALUE;
		Deque<Integer> dq = new ArrayDeque<>();
		
		//First Window
		for(int i=0; i<k; i++) {
			while(!dq.isEmpty() && nums[i]> nums[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		res[0] = nums[dq.peekFirst()];
		
		int j = 1;
		for(int i= k; i<nums.length; i++) {
			
			while(!dq.isEmpty() && nums[i]>= nums[dq.peekLast()]) {
				dq.removeLast();
			}
			
			while(!dq.isEmpty() && dq.peekFirst() < (i-k+1)) {
				dq.removeFirst();
			}
	
			dq.addLast(i);
			res[j++] = nums[dq.peekFirst()]; 
	
		}
		return res;
    }
}
