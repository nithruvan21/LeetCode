import java.util.Scanner;

class Solution { 
    public static boolean isHappy(int n) { // tortoise and hare approach
        
        int slow = n; // initially both slow and false are n
        int fast = n;

        do{ // using do while because initially both slow and fast are equal
            
            slow = square(slow); // moving slow by one place
            fast = square(square(fast)); // moving fast by two places
            System.out.println("Slow: "+slow);
            System.out.println("Fast: "+ fast);
            System.out.println();

        }while(slow!=fast); // if there is a cycle, then there is a chance to check (terminate loop)

        return slow==1; // if slow is 1, then it is a happy number!
    }
    public static int square(int n){ // method to find the sum of the squares of each digit of number 'n'
        int res = 0;

        while(n > 0){
            int remainder = n%10;
            res+= remainder*remainder;
            n/=10;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        System.out.println(isHappy(sc.nextInt()));
        sc.close();
    }
}