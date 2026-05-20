package DSA.LinkedList.Questions;

public class RotateList {
    public static ListNode rotateList(ListNode head, int k){
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while(last.next!=null){
            last = last.next;
            length++;
        }
        k  = k%length;
        if(k==0){
            return head;
        }
        int rem = length - k;
        last.next = head;
        ListNode newLast = head;
        while(rem-1>0){
            newLast = newLast.next;
            rem--;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
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

        ListNode head = rotateList(n1,2);
        display(head);
    }

}
