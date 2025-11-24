package arrays;

/*
 * Problem: Find Missing Number
 * Problem link: https://leetcode.com/problems/missing-number/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n)
 */

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int supposedSum = n * (n + 1) / 2;

        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
        }
        return supposedSum - currentSum;
    }
}
