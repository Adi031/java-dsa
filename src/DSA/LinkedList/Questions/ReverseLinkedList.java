package DSA.LinkedList.Questions;

import java.util.List;

// google, apple, amazon, microsoft
public class ReverseLinkedList {
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode reverseRec(ListNode node){
        if(node == null|| node.next == null){
            return node;
        }
        ListNode newNode = reverseRec(node.next);
        node.next.next = node;
        node.next = null;
        return newNode;
    }

// Google, Microsoft, Facebook
    public static ListNode reverseBetween(ListNode node, int left, int right){
        ListNode curr = node;
        ListNode prev = null;
        for (int i = 0; i < left-1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode newEnd = curr;
        for (int i = 0; curr!= null && i < right-left+1; i++) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
                curr = temp;
        }
        if(last!=null){
            last.next = prev;
        }
        else{
            node = prev;
        }
        newEnd.next = curr;
        return node;
    }

    public static void display(ListNode node){
        while(node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(7);
        ListNode n4 = new ListNode(5,n5);
        ListNode n3 = new ListNode(9,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(4,n2);

        ListNode head = reverse(n3);
//        ListNode head = reverseRec(n1);
//        ListNode head = reverseBetween(n1, 2, 4);
        display(head);

    }
}
