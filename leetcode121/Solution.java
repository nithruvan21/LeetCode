// 121. Best Time to Buy and Sell Stock
// Solved
// Easy
// Topics
// Companies
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

public class Solution{
    public static int maxProfit(int[] prices) {
        int profit = 0; //base profit is 0
        int buyPrice = prices[0]; // first day's price
        for(int i = 1 ; i < prices.length; i++){ // starting from the second da i.e., 1st index
            if(prices[i]<buyPrice){ // if we get a low price we make it our buy price
                buyPrice = prices[i]; 
            }
            profit = Math.max(profit, prices[i] - buyPrice); // previous profit is compared with curPrice - buyPrice
        }
        return profit; // return the maximum profit
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}