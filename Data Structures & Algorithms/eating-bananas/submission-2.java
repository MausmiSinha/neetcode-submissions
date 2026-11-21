class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high=0;
		for (int pile : piles) {
		       high = Math.max(high, pile);
		    }
		int result = high;
		
		
		while(low<=high) {
			int mid = low+((high-low)/2);
			long hours=0;
			for(int i: piles) {
				hours = Math.ceilDiv(i, mid) + hours;
			}
			
			
			if(hours<=h) {
				result = mid;
				high = mid - 1;
			}
			else {
				low = mid+1;
			}
		}
		
		return result;
    }
}
