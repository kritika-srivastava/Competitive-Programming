/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/best_time_to_buy_and_sell_stock_II.java
 * 
 * @author Kritika Srivastava
 * @since June 25, 2021
 *
 *        Description - You are given an array prices where prices[i] is the
 *        price of a given stock on the ith day. Find the maximum profit you can
 *        achieve. You may complete as many transactions as you like (i.e., buy
 *        one and sell one share of the stock multiple times). Note: You may not
 *        engage in multiple transactions simultaneously (i.e., you must sell
 *        the stock before you buy again).
 * 
 *        Link -
 *        https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class best_time_to_buy_and_sell_stock_II {
    public int maxProfit(int[] prices) {
        int ret = 0, min = 0;
        boolean buy = true;
        for (int i = 0; i < prices.length - 1; i++) {
            if (buy == true && prices[i] < prices[i + 1]) {
                min = prices[i];
                buy = false;
            } else if (buy == false && prices[i] >= prices[i + 1]) {
                ret += (prices[i] - min);
                min = 0;
                buy = true;
            } else {
            }
        }

        if (buy == false && prices[prices.length - 1] > min) {
            ret += (prices[prices.length - 1] - min);
        } else {
        }

        return ret;
    }
}
