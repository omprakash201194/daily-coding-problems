package com.omprakashgautam.dailycodingproblems.oct2024;

/*
#Day 2 - Coding interview problem for today.

Problem 2 - Best time to buy and sell stock

We are given an array Arr[] of length n. It represents the price of a stock on ‘n’ days.

The following guidelines need to be followed:
We can buy and sell a stock only once.
We can buy and sell the stock on any day but to sell the stock, we need to first buy it on the same or any previous day.
We need to tell the maximum profit one can get by buying and selling this stock.
 */
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
