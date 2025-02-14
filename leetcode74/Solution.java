// 74. Search a 2D Matrix
// Medium
// Topics
// Companies
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

 

// Example 1:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("Row: "+m+" Column: "+n);
        System.out.println(17/2);
        int low = 0;
        int high = m*n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/n;
            int col = mid%n;
            if(target>matrix[row][col]){
                low = mid+1;
            }else if(target<matrix[row][col]){
                high = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},
                            {10,11,16,20},
                            {23,30,34,60}};
        System.out.println(searchMatrix(matrix, 4));
    }
}