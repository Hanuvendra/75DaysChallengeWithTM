package dsaproblems;

public class best_time_to_buy_and_sell_stock_ii {

	public int maxProfit(int[] nums) {
        int buy=nums[0];
        int sell=nums[0];
        int maxProfit = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=sell){
                sell=nums[i];
            }else{
                maxProfit += (sell-buy);
                buy=nums[i];
                sell=nums[i];
            }
        }
        maxProfit += (sell-buy);
        return maxProfit;
    }
	
	public static void main(String[] args) {
		// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
		// Call function here
	}

}
