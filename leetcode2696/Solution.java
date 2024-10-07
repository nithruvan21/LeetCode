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