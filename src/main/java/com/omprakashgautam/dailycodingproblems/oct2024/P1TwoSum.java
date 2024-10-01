package com.omprakashgautam.dailycodingproblems.oct2024;

import java.util.HashMap;
import java.util.Map;

/*
    #Day 1 - Coding interview problem for today.

Problem 1 - Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

Asked by
#Google
 */
public class P1TwoSum {
    public static void main(String[] args) {
        int [] numbers = new int[]{2,5,7,3};
        int k = 8;

        System.out.println(sumOfNumbers(numbers, k));

    }

    private static boolean sumOfNumbers(int[] numbers, int k) {
        // Handle basic edge cases
        if (numbers.length < 2){
            return false;
        }
        Map<Integer, Integer> store = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++){
            if (store.containsKey(k - numbers[i])){
                return true;
            }
            store.put(numbers[i], i);
        }
        return false;
    }
}

/*
    Time complexity: O(n)
    Space complexity: O(n)
 */