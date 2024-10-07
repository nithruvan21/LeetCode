// You are given a string s consisting only of uppercase English letters.

// You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

// Return the minimum possible length of the resulting string that you can obtain.

// Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.

 

// Example 1:

// Input: s = "ABFCACDB"
// Output: 2
// Explanation: We can do the following operations:
// - Remove the substring "ABFCACDB", so s = "FCACDB".
// - Remove the substring "FCACDB", so s = "FCAB".
// - Remove the substring "FCAB", so s = "FC".
// So the resulting length of the string is 2.
// It can be shown that it is the minimum length that we can obtain.

import java.util.Stack;

public class Solution{
    public static void main(String[] args) {
        String s = "ABFCACDB";
        int n = s.length();
        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<n;i++){
            char currChar = s.charAt(i);
            if(stk.isEmpty()){
                stk.push(currChar);
            }
            else if(currChar=='B' && stk.peek()=='A'){
                stk.pop();
            }
            else if(currChar=='D' && stk.peek()=='C'){
                stk.pop();
            }
            else{
                stk.push(currChar);
            }
        }
        System.out.println(stk.size());  
    }
}