package arrays;

/**
 * Given an array prices[] of length N, representing the prices
 * of the stocks on different days, the task is to find the
 * maximum profit possible for buying and selling the stocks
 * on different days using transactions where at most one
 * transaction is allowed.
 * Url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * */

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = calculateMaxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    public static int calculateMaxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i : prices) {
            min = Math.min(min, i);
            profit = Math.max(profit, i - min);
        }

        return profit;
    }
}
