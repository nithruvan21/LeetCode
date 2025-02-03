// 118. Pascal's Triangle
// Solved
// Easy
// Topics
// Companies
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int nCr(int n, int r){ // n = row, r = column
        long res = 1;
        for(int i = 0 ; i < r ; i++){
            res *= (n - i);
            res /= (i + 1);
        }
        return (int)res;
    }

    public static List<List<Integer>> pascalsTriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 1 ; j <= i ; j++){
                temp.add(nCr(i-1,j-1));
            }
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = pascalsTriangle(5);
        for(List<Integer> it : ans){
            for(int i : it){
                System.out.print(i);
            }System.out.println();
        }
    }
}