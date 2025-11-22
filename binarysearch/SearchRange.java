package binarysearch;


/*
 * Problem: Find First and Last Position of Element in Sorted Array
 * Problem link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Platform: LeetCode
 * Difficulty: Medium
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(log(n))
 */

public class SearchRange {
    public int[] searchRange(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int before = -1;
        int after = -1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target ){
                before = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target)
                high = mid - 1;
                else 
                    low = mid + 1;
        }
        if(before == -1){
            return new int[] {-1,-1};
        }
        low = 0;
        high = nums.length - 1;
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target){
                after = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target)
                high = mid - 1;
                else 
                    low = mid + 1;
        }
            return new int[] {before,after};
    }
}
