class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
  	 int[] result = new int[nums.length - k + 1];
Deque<Integer> dequeue = new ArrayDeque<>();

for (int i = 0; i < k; i++) {
   while (!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]) {
       dequeue.removeLast();
   }
   dequeue.addLast(i); 
}

result[0] = nums[dequeue.peekFirst()];
int j = 1;


for (int i = k; i < nums.length; i++) {
   while (!dequeue.isEmpty() && dequeue.peekFirst() < i - k + 1) {
       dequeue.removeFirst();
   }
   
   while (!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]) {
       dequeue.removeLast();
   }
   
   dequeue.addLast(i);
   result[j++] = nums[dequeue.peekFirst()]; 
}

return result;
    }
}
