// 75. Sort Colors
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution {
    public static void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue = nums.length-1;
        while(white<=blue){
            if(nums[white]==0){
                int temp = nums[white];
                nums[white]=nums[red];
                nums[red]=temp;
                red++;white++;
            }
            else if(nums[white]==1){
                white++;
            }
            else{
                int temp = nums[white];
                nums[white]=nums[blue];
                nums[blue]=temp;
                blue--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1,1,0,2};
        sortColors(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}

// class Solution {
//     public void sortColors(int[] nums) {
//         HashMap<Integer, Integer> count = new HashMap<>();
//         count.put(0, 0);
//         count.put(1, 0);
//         count.put(2, 0);

//         for (int num : nums) {
//             count.put(num, count.get(num) + 1);
//         }

//         int idx = 0;
//         for (int color = 0; color < 3; color++) {
//             int freq = count.get(color);
//             for (int j = 0; j < freq; j++) {
//                 nums[idx] = color;
//                 idx++;
//             }
//         }        
//     }
// }