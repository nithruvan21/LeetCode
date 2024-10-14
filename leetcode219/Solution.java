// 219. Contains Duplicate II
// Solved
// Easy
// Topics
// Companies
// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

import java.util.HashMap;

class Solution{
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        int k = 1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        boolean result = false;
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && i-map.get(arr[i])<=k){ // if map already has the number and if current index - occured no index <= k 
                result=true;
            }else{
                map.put(arr[i], i); // key = number ; value = numbers's index
            }
        }
        System.out.println(result);
    }
}