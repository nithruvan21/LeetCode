// 34. Find First and Last Position of Element in Sorted Array
// Solved
// Medium
// Topics
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2]; //resulting array
        int left = binarySearch(nums, target, true); //searching for the leftmost (first) occurance of the target
        int right = binarySearch(nums, target, false); // searching for the rightmost (last) occurance of the target
        result[0] = left;
        result[1] = right;
        return result; //returning the result array
    }
    public static int binarySearch(int[] nums, int target, boolean isLeftSearch){
        int idx = -1; //case if target not found
        int left = 0; // fundamental left and right idx for binary search
        int right = nums.length-1;
        int mid = 0; // mid value
        while(left<=right){
            mid = (left+right)/2; //updating mid value
            if(nums[mid]<target){ // if target is in the right side of the mid value
                left = mid+1;
            }else if(nums[mid]>target){ // if target is in the left side of the mid value
                right = mid-1;
            }else{ // if target is found
                idx = mid; // update idx to mid.. the index where we found our target. (normal bs stops here)
                if(isLeftSearch){ // if we are in search for the first index
                    right = mid-1; 
                }else{ // if we are in search for the last index
                    left = mid+1;
                }
            }
        } // the termination will eventually happen and we may or may not find the target
        return idx;
    }
    public static void main(String[] args) {
        int[] nums = {7,8,8,8,8,8,8,8,8,8,8,9};
        int[] result = searchRange(nums, 8);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}