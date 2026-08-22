class Solution {
    public int maxProfit(int[] prices) {
        int sol=0;
        int l=0;
        int r=1;
        if(prices.length<=1) return sol;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                sol=Math.max(sol,profit);
            } else {
                l=r;
            }
            r++;
        }
        return sol;
    }
}
