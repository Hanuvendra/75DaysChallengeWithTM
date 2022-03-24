package dsaproblems;

public class best_time_to_buy_and_sell_stock {
	
	public int maxProfit(int[] prices) {
        int buy = prices[0];
        int n=prices.length;
        int maxProfit=0;
        for(int i=1;i<n;i++){
            int sell = prices[i];
            maxProfit = Math.max(maxProfit,sell-buy);
            buy = Math.min(buy,sell);
        }
        return maxProfit;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
		// Call function here
	}

}
