package arrays;

/*
 * Problem: Remove Element
 * Problem link: https://leetcode.com/problems/remove-element/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n)
 */



public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}