package arrays;

/*
 * Problem: Search Insert Position
 * Problem link: https://leetcode.com/problems/search-insert-position/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(log(n))
 */

// Binary Search Approach(Most Optimal)

public class SearchInteger {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] >= target){
                high = mid - 1;
            }
            else 
                low = mid + 1;
        }
        return low;
    }
}