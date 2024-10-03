package com.omprakashgautam.dailycodingproblems.oct2024;

import java.util.HashMap;
import java.util.Map;

/*
Problem 3 - Contains Duplicate : Check if a value appears atleast twice

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true.
Explanation: 1 appeared two times in the input array.

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
Explanation: input array does not contain any duplicate number.
 */
public class P3ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = new int[]{7,1,5,3,6,4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> store = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++){
            if (store.containsKey(nums[i])){
                return false;
            }
            store.put(nums[i], i);
        }
        return true;
    }
}
