class Solution {
    public int[] productExceptSelf(int[] nums) {
        	int[] leftProd = new int[nums.length];
	int[] rightProd = new int[nums.length];
	int[] result = new int[nums.length];
	int lp=1, rp=1;
	
	for(int i=0; i< nums.length; i++) {
		leftProd[i] = lp;
		lp = lp * nums[i];
	}
	
	for(int i=nums.length-1 ; i>=0; i--) {
		rightProd[i] = rp;
		rp = rp*nums[i];
	}
        
    for(int i=0; i< nums.length; i++) {
    	result[i] = leftProd[i]*rightProd[i];
    }
    
    return result;
    }
}  
