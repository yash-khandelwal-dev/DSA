package arrays;

/*
 * Problem: Find Single Number
 * Problem link: https://leetcode.com/problems/single-number/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O((n^2))
 */



public class SingleNumber {
    public int singleNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            boolean found = false;
            for(int j = 0;j<nums.length;j++){
                if(i!=j && nums[i] == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
            return nums[i];
            }
        }
        return -1;
    }
}

