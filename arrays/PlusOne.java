package arrays;

/*
 * Problem: Plus One
 * Problem link: https://leetcode.com/problems/plus-one/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n)
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i >= 0;i--){
            int sum = digits[i] + 1;
            if(sum < 10){
                digits[i] = sum;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] new_Result = new int[digits.length + 1];
        new_Result[0] = 1;
        return new_Result;
    }
}
