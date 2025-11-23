package binarysearch;

/*
 * Problem: Binary Search
 * Problem link: https://leetcode.com/problems/binary-search/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(log(n))
 */


public class Search {
    public int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    while(low <= high){
        int mid = (low + high) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target){
            high = mid - 1;
        }
        else 
            low = mid + 1;
    }
    return -1;
    }
}