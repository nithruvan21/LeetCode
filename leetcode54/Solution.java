// 54. Spiral Matrix
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an m x n matrix, return all elements of the matrix in spiral order.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]


import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, top= 0;
        int right = m-1, bottom = n-1;


        while(top<=bottom && left<=right){
            for(int i = left ; i<=right ;i++){
                // System.out.print(matrix[top][i]);
                ans.add(matrix[top][i]);
            }        
            top++; // top steps down by 1
    
            for(int i = top ; i <= bottom ; i++){
                // System.out.print(matrix[i][right]);
                ans.add(matrix[i][right]);
            }
            right--; // right moves towards left by 1
    
            if(top<=bottom){
                for(int i = right ; i>=left ; i--){
                    // System.out.print(matrix[bottom][i]);
                    ans.add(matrix[bottom][i]);
                }
                bottom--; // bottom steps up by 1
            }
    
            if(left<=right){
                for(int i = bottom ; i >=top; i--){
                    // System.out.print(matrix[i][left]);
                    ans.add(matrix[i][left]);
                }
                left++; // left moves towards right by 1
            }
        }

        // for(int i : ans){
        //     System.out.print(i+" ");
        // }
        return ans;
    }
    public static void main(String[] args){

        int n = 6; 
        int[][] matrix = new int[n][n];

        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = num++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
        List<Integer> ans = spiralOrder(matrix);
    }
}
// 1 2 3 4 5 6 
// 7 8 9 10 11 12
// 13 14 15 16 17 18
// 19 20 21 22 23 24
// 25 26 27 28 29 30
// 31 32 33 34 35 36