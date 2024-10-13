// 125. Valid Palindrome
// Solved
// Easy
// Topics
// Companies
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

public class Solution{
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if(!Character.isLetterOrDigit(startChar)){
                start++;
            }else if(!Character.isLetterOrDigit(endChar)){
                end--;
            }else{
                if(Character.toLowerCase(startChar)!=Character.toLowerCase(endChar)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal : Panama";
        System.out.println(isPalindrome(s));
    }
}
// String s = "A man, a plan, a canal : Panama";
//         String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//         String rev = new StringBuffer(actual).reverse().toString();
//         System.out.println(actual.equals(rev));