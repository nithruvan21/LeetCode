public class Solution {
    public static Node findNthNode(Node head, int t){
        int count = 1 ;
        Node newTail = head;
        while(newTail!=null){
            if(count == t) return newTail;
            newTail = newTail.next;
            count++;
        }
        return newTail;
    }

    public static Node rotateRight(Node head, int k) {
        Node tail = head;
        int len = 1;
        while(tail.next!=null){
            tail = tail.next;
            len++;
        }
        if(k % len == 0) return head; //multiple of k : will return the same og list

        k = k % len;
        Node newTail = findNthNode(head,len-k);
        tail.next = head;
        head = newTail.next;
        newTail.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next = new Node(5);
        Node res = rotateRight(head, 4);

        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
