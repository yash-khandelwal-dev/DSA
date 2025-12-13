package arrays;

/*
 * Problem: Rotate Array
 * Problem link: https://leetcode.com/problems/rotate-array/
 * Platform: LeetCode
 * Difficulty: Medium
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n)
 */

public class Rotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n;

        int[] temp = new int[d];
        
        for (int i = 0; i < d; i++) {
            temp[i] = nums[n - d + i];
        }
        for (int i = n - 1; i >= d; i--) {
            nums[i] = nums[i - d];
        }
        for (int i = 0; i < d; i++) {
            nums[i] = temp[i];
        }
    }
}


