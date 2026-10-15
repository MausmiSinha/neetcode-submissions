class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int diff;
        for(int i=0; i<prices.length-1; i++){
            for(int j= i+1; j< prices.length; j++){
                diff = prices[j] - prices[i];
                profit = (diff> profit)? diff: profit;
               
            }
        }

        return profit;
        
    }
}
