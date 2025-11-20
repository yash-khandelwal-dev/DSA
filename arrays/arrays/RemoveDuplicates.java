package arrays;
import java.util.LinkedHashSet;

/*
 * Problem: Remove Duplicates from Sorted Array
 * Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n)
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hp = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {

            hp.add(nums[i]);

        }

        int count = 0;

        for (int val : hp) {
            nums[count++] = val;
        }
        return hp.size();

    }
}