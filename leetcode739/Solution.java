// 739. Daily Temperatures
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

// Example 1:

// Input: temperatures = [73,74,75,71,69,72,76,73]
// Output: [1,1,4,2,1,1,0,0]
// Example 2:

// Input: temperatures = [30,40,50,60]
// Output: [1,1,1,0]
// Example 3:

// Input: temperatures = [30,60,90]
// Output: [1,1,0]


import java.util.Stack;

class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<Integer>();
        int ans[] = new int[temperatures.length];
        for(int i = 0; i<temperatures.length;i++){
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                int idx = stk.pop();
                ans[idx] = i-idx;
            }
            stk.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        int ans[] = dailyTemperatures(temp);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}