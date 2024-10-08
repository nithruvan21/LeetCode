// 921. Minimum Add to Make Parentheses Valid
// Solved
// Medium
// Topics
// Companies
// A parentheses string is valid if and only if:

// It is the empty string,
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.
// You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

// For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
// Return the minimum number of moves required to make s valid.

// Example 1:
// Input: s = "())"
// Output: 1

// Example 2:
// Input: s = "((("
// Output: 3

import java.util.*;
class Solution {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(stk.empty())
                stk.push(ch);
            else if(stk.peek()=='(' && ch==')'){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        return stk.size();
    }
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
    }
}