// 128. Longest Consecutive Sequence
// Solved
// Medium
// Topics
// Companies
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9


import java.util.HashSet;
import java.util.Set;

class Solution{
    public static int longestConsecutive(int[] nums) {
        int longLen = 0;

        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        for(int i : nums){
            if(!set.contains(i-1)){
                int len = 0;
                int num=i;
                while (set.contains(num)) {
                    len++;
                    num++;
                }
                longLen = Math.max(len, longLen);
            }
        }

        return longLen;
    }
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1,2,0,1}));
    }
}