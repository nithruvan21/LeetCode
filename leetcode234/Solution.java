import java.util.Stack;

class Solution {
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stk.push(temp.val);
            temp=temp.next;
        }
        temp = head;
        while(temp!=null){
            if(stk.pop()!=temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        System.out.println(isPalindrome(head));
        ListNode rev = reverseLinkedList(head);
        printLinkedList(rev);
    }
}