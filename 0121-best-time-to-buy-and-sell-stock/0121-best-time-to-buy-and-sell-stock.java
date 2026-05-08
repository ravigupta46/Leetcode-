class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice) minprice=prices[i];
            if(maxprofit<prices[i]-minprice) maxprofit=prices[i]-minprice;
        }
        return maxprofit;
    }
}