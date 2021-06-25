/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/best_time_to_buy_and_sell_stock.java
 * 
 * @author Kritika Srivastava
 * @since June 25, 2021
 *
 *        Description - You are given an array prices where prices[i] is the
 *        price of a given stock on the ith day. You want to maximize your
 *        profit by choosing a single day to buy one stock and choosing a
 *        different day in the future to sell that stock. Return the maximu
 *        profit you can achieve from this transaction. If you cannot achiev any
 *        profit, return 0.
 * 
 *        Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
