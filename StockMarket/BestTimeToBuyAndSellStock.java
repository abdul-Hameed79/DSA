package StockMarket;

public class BestTimeToBuyAndSellStock {
    // Main.java
    public static void main(String[] args) {
        int[] prices = {7, 2, 5, 3, 6, 4};
        System.out.println("Maximum profit is: " + maxProfit(prices));
    }

    // Function to find max profit
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}