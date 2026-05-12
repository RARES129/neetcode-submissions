class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxProfit=0;
        int left = 0;
        int right = 0;
        while (right<prices.length){
            if(prices[left]<prices[right]){
                profit=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit,profit);
            }else{
                left=right;
            }
            right++;
        }
        return maxProfit;
    }
}
