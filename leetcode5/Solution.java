// 5. Longest Palindromic Substring
// Solved
// Medium
// Topics
// Companies
// Hint
// Given a string s, return the longest palindromic substring in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

class Solution {
    public static boolean isPalindrome(int l, int r, String s){
        while (l<r) {
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String res = "";
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(isPalindrome(i, j, s) && max<j-i+1){
                    max = j-i+1;
                    res = s.substring(i, j+1);
                }
            }
        }
        return res;
    }
}