class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int lp=1;
        int rp=1;

        for (int i=0; i<nums.length; i++){
            res[i] = lp;
            lp = lp*nums[i];
        }

        for(int i=nums.length-1 ; i>=0; i--){
            res[i] = res[i]*rp;
            rp = rp*nums[i];
        }

        return res;
        
    }
}  
