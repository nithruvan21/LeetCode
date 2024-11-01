// 28. Find the Index of the First Occurrence in a String
// Solved
// Easy
// Topics
// Companies
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

public class Solution {
    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;

        for(int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("nithruvan", "ruvan"));
    }
}

// if(needle.length()>haystack.length()) return -1;
//         int idx = 0;
//         for(int i = 0 ; i < haystack.length() ; i++){
//             if(haystack.charAt(i)==needle.charAt(0)){
//                 idx = i ; 
//                 int k=i;
//                 for(int j = 0 ; j < needle.length() ; j++){
//                     if(needle.charAt(j)==haystack.charAt(k)){
//                         if(k<haystack.length()-1){
//                             k++;
//                         }
//                     }
//                 }
//                 if((k-i)==needle.length()) return idx;
//             }
//         }
//         return -1; passed 72/83 testcases