class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int l=0;
        int diff;
        int[] lefhtHighest = new int[prices.length];

        for(int i=prices.length-1; i>= 0; i--){
            l = (prices[i]>=l)? prices[i]: l;
            lefhtHighest[i] = l;
        }

        for(int i=0; i< prices.length; i++){
            profit = ((lefhtHighest[i]-prices[i]) > profit)? (lefhtHighest[i]-prices[i]): profit;
        }



        return profit;
        
    }
}
