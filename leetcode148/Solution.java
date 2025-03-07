// 148. Sort List
// Medium
// Topics
// Companies
// Given the head of a linked list, return the list after sorting it in ascending order.

 

// Example 1:


// Input: head = [4,2,1,3]
// Output: [1,2,3,4]
// Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

public class Solution {
    public static Node mergeSortTwoLL(Node l1 , Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;

        return dummy.next;
    }

    public static Node findMiddle(Node head){
        if(head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node sortList(Node head) {
        if(head==null || head.next==null) return head;

        Node middle = findMiddle(head);

        Node right = middle.next;
        middle.next = null;
        Node left = head;

        left = sortList(left);
        right = sortList(right);

        return mergeSortTwoLL(left,right);
    }

    public static void main(String[] args) {
        Node list = new Node(3);
        list.next = new Node(4);
        list.next.next = new Node(1);
        list.next.next.next = new Node(5);
        list.next.next.next.next = new Node(2);

        list = sortList(list);

        while(list!=null){
            System.out.println(list.val);
            list=  list.next;
        }

    }
}