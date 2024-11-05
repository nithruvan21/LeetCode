// 3. Longest Substring Without Repeating Characters
// Solved
// Medium
// Topics
// Companies
// Hint
// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int n = s.length();
        for(int right = 0 ; right < n ; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLen = Math.max(maxLen, right-left+1);
            }else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLen ;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}

// public static int lengthOfLongestSubstring(String s) {
//     HashMap<Character,Integer> map = new HashMap<>();
//     int i = 0;
//     int maxLen = 0;
//     int len = 0;
//     while(i<s.length()){
//         if(map.containsKey(s.charAt(i))){
//             map.clear();
//             len=0;
//             map.put(s.charAt(i),1);
//             len++;
//         }
//         else{
//             map.put(s.charAt(i), 1);
//             len++;
//             maxLen = Math.max(maxLen, len);
//         }
//         i++;
//     }
//     return maxLen ;
// } 409/976 passed