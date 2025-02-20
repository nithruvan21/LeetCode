// 229. Majority Element II
// Medium
// Topics
// Companies
// Hint
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]

// Boyer-Moore Majority Voting

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0 , candidate2 = 0;
        int count1 = 0, count2 = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(count1==0 && nums[i]!=candidate2){
                candidate1 = nums[i];
                count1 = 1;
            }else if(count2==0 && nums[i]!=candidate1){
                candidate2 = nums[i];
                count2 = 1;
            }else if(nums[i]==candidate1){
                count1++;
            }else if(candidate2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0; 
        count2 = 0;

        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i]==candidate1) count1++;
            else if(nums[i]==candidate2) count2++;
        }

        List<Integer> res = new ArrayList<>();
        int threshold = nums.length/3;
        if(count1>threshold){
            res.add(candidate1);
        }
        if(count2>threshold){
            res.add(candidate2);
        }

        return res;
    }
    public static void main(String[] args) {
        List<Integer> ans = majorityElement(new int[] {1,1,1,1,1,2,2,2,2,2,3,3,3});
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}