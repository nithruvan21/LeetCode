// 136. Single Number
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1

import java.util.HashMap;

class Solution{
    public static int singleNumber(int[] arr){
        HashMap<Integer,Integer> val = new HashMap<Integer,Integer>();
        for(int i = 0 ;i < arr.length;i++){
            if(val.containsKey(arr[i])){
                val.put(arr[i], val.get(arr[i])+1);
            }
            else{
                val.put(arr[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> ent: val.entrySet()){
            if(ent.getValue()==1){
                return ent.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,4,5,5};
        System.out.println(singleNumber(arr));
    }
}

// int maxNum = 0 ; 
//         for(int i: arr){
//             maxNum = Math.max(maxNum, i);
//         }
//         int[] hash = new int[maxNum+1];
//         for(int i:arr){
//             hash[i]++;
//         }
//         for(int i = 0 ; i < hash.length; i++){
//             if(hash[i]==1){
//                 System.out.println(arr[i+1]);
//             }
//         }