// 20. Valid Parentheses
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true
// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stk.isEmpty()){
                stk.push(c);
            }else if((c==')' && stk.peek()=='(') || (c==']' && stk.peek()=='[')|| (c=='}' && stk.peek()=='{')){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}()"));
    }
}