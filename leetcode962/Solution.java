// 962. Maximum Width Ramp
// Solved
// Medium
// Topics
// Companies
// A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such a ramp is j - i.

// Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.

 

// Example 1:

// Input: nums = [6,0,8,2,1,5]
// Output: 4
// Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
// Example 2:

// Input: nums = [9,8,1,0,1,9,4,0,4,1]
// Output: 7
// Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.

class Solution {
    public static int maxWidthRamp(int[] A) {
        int n = A.length; 
        int[] rMax = new int[n];
        rMax[n-1]=A[n-1];
        for(int i = n-2;i>=0;i--){
          rMax[i]=Math.max(A[i],rMax[i+1]);
        }
        int left=0,right=0;
        int ans=0;
        while(right<n){
          while(left<right && A[left]>rMax[right]){
            left++;
          }
          ans = Math.max(ans, right-left);
          right++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {9,8,1,0,1,9,4,0,4,1};
        
        System.out.println(maxWidthRamp(nums));

    }
}

// class Solution {
//   public int maxWidthRamp(int[] nums) {
//       int ret = 0;
//       Deque<Integer> stack = new ArrayDeque<>();

//       for (int i = 0; i < nums.length; i++) {
//           if (stack.isEmpty() || nums[i] < nums[stack.peek()]) {
//               stack.push(i);
//           }
//       }

//       for (int i = nums.length - 1; i >= 0; i--) {
//           while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
//               int j = stack.pop();
//               ret = Math.max(i - j, ret);
//           }
//       }

//       return ret;
//   }
// }