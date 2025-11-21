package arrays;

/*
 * Problem: Search Insert Position
 * Problem link: https://leetcode.com/problems/search-insert-position/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n)
 */


public class SearchInteger {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}