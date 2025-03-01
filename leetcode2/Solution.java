// 2. Add Two Numbers
// Medium
// Topics
// Companies
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Example 1:


// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:

// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]


class Solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0){
            int sum = 0;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next; 
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(6);

        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(3);

        ListNode res = addTwoNumbers(l1, l2);

        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}