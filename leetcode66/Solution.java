// 66. Plus One
// Solved
// Easy
// Topics
// Companies
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

 

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].


class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){ //traversing in the reverse order
            if(digits[i]+1 != 10){ // if the result after adding 1 to the last digit is not 10
                digits[i]+=1; // then add 1 to the end
                return digits; // return the array
            }
            digits[i]=0; // if not, then make that digits place as 0 and repeat again
        }
        int newDigit[] = new int[digits.length+1]; // this is for the case (9,9) or (9,9,9) or (9,9,9,9)
        newDigit[0] = 1;
        return newDigit;
    }
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        int[] res = plusOne(nums);
        for(int i : res){
            System.out.print(i+"");
        }
    }
}