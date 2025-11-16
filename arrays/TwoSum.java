package arrays;

/**
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 *
 * Time Complexity: O(n^2)
 */
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};                }
            }
        }
        return new int[0];
    }
}