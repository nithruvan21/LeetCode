// 22. Generate Parentheses
// Solved
// Medium
// Topics
// Companies
// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void recurse(List<String> res, int left, int right,String s, int n){
        // this method will recursively build the valid paranthesises

        // if the resultant string reached the 2*n size (i.e., for n=2, the max limit is 4 {(()),()()})
        if(s.length()==n*2){
            res.add(s);
            return;
        }

        //we are moving from both the sides, left and right
        
        // tracking whether the left limit is reached { (( - limit }
        if(left < n){
            recurse(res, left+1, right, s+"(", n); //  adding only "("
        }

        // tracking whether the right side reached the limit
        if(right < left){
            recurse(res, left, right+1, s+")", n); // adding only ")"
        }


    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        recurse(res, 0, 0, "", n);
        
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> res = generateParenthesis(n);
        for(String s : res){
            System.out.println(s);
        }
    }
    
}