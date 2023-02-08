/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the 
future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

public class Q2 {
    public int maxProfit(int [] prices){
        int minimum = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minimum){
                minimum = prices[i];
            } else if(prices[i] - minimum > maxprofit){
                maxprofit = prices[i] - minimum;
            }
        }
        return maxprofit;
    }

    public void Main(String[]args){
        int [] prices1 = {7, 1, 5, 3, 6, 4};
        int [] prices2 = {7, 6, 4, 3, 1};
        // int [] prices3 = {};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}
