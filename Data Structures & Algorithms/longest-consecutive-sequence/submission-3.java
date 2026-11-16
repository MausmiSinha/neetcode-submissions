class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums == null || nums.length == 0) return 0;
		 
		 
		 HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
		 
		 for(int num: nums) {
			 map.put(num, false);
		 }
		 

		
		 int finalMax = Integer.MIN_VALUE ;
		 
		 for(int i=0; i<nums.length ; i++) {
            if(map.get(nums[i]) == true) continue;
			 map.put(nums[i], true);
			 int length = 1;
			 int a = nums[i]-1;
			 while(map.containsKey(a) && map.get(a) == false) {
				 length++;
				 map.put(a, true);
				 a--;
			 }
			 a = nums[i]+1;
			 while(map.containsKey(a) && map.get(a) == false) {
				 length++;
				 map.put(a, true);
				 a++;
			 }
			 
			 finalMax = Math.max(finalMax, length);
					 
		 }
		 
		 
		 
		 return finalMax;
	     
    }
}
