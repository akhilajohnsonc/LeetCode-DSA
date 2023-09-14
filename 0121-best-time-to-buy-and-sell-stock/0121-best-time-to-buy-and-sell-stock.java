class Solution {
    public int maxProfit(int[] prices) {
        int L = 0;
        int max = 0;
        for(int R = 1; R< prices.length ; R++){
            if(prices[R] > prices[L]){
                int profit = prices[R] - prices[L];
                max = Math.max(max , profit);
            } else{
                L=R;
            }
        }
        return max;
    }
}