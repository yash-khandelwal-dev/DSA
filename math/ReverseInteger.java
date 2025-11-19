package math;

/*
 * Problem: Reverse Integer
 * Problem link: https://leetcode.com/problems/reverse-integer/
 * Platform: LeetCode
 * Difficulty: Medium
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n(log(x)))
 */

public class ReverseInteger {
    public int reverse(int x) {
        int revnum = 0;

        while (x != 0) {
            int pop = x % 10;  
            x /= 10;           
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0;
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;

            revnum = revnum * 10 + pop;
        }

        return revnum;
    }
}
