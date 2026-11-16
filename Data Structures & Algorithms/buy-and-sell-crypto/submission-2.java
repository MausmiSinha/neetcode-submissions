class Solution {
    public int maxProfit(int[] prices) {
         int l = 0, max = Integer.MIN_VALUE;
		 int[] leftHighest = new int[prices.length];
		 
		 for(int i=prices.length-1; i>= 0; i--) {
			 l = (prices[i] >= l) ? prices[i] :l;
			 leftHighest[i] = l; 
		 }
		 
		 for(int i=0; i<prices.length; i++) {
			max = Math.max(max, leftHighest[i]-prices[i]);
		 }
		 
		 return max;
    }
}
