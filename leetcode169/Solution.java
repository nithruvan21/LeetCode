// 169. Majority Element
// Solved
// Easy
// Topics
// Companies
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.HashMap;

class Solution {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(numMap.containsKey(i)){
                numMap.put(i,numMap.get(i)+1);
            }
            else{
                numMap.put(i,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> ent : numMap.entrySet()){
            if(ent.getValue()>(nums.length/2)){
                return ent.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}