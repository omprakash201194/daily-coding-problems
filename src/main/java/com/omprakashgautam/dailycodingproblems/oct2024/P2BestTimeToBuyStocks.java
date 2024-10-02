package com.omprakashgautam.dailycodingproblems.oct2024;

public class P2BestTimeToBuyStocks {
    public static void main(String[] args) {
        int [] stocks = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(stocks));
    }

    private static int maxProfit(int[] stocks) {
        int maxProfit = 0;
        int min = stocks[0];
        for (int i = 1; i < stocks.length; i++){
            min = Math.min(min, stocks[i]);
            maxProfit = Math.max(maxProfit, stocks[i] - min);
        }
        return maxProfit;
    }
}
