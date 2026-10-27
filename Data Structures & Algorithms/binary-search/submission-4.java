class Solution {
    public int search(int[] nums, int target) {
        int l=0, r = nums.length;
        
        while(l<r) {
        	int mid = l + (r-l)/2;
        	if(target > nums[mid] ) l = mid+1;
        	else if(target < nums[mid] ) r = mid;
        	else return mid;
        }
        return -1;
        
    }
}
