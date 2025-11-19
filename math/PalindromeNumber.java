package math;

/*
 * Problem: Palindrome Number
 * Problem link: https://leetcode.com/problems/palindrome-number/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(log(n))
 */


public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int dup=x;
        int revnum=0;
        while(x>0){
            revnum = (revnum * 10)+(x % 10);
            x=x/10;
        }
        if(revnum==dup){
            return true;
        }
        else{
        return false;
        }
    }
}
