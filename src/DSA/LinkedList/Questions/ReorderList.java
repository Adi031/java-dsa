package DSA.LinkedList.Questions;

public class ReorderList {
    public static void reorder(ListNode head){
        ListNode mid = getMiddle(head);
        ListNode head2 = reverse(mid);
        ListNode head1 = head;
        while(head1!= null && head2!= null){
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;
            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }
        if (head1 != null) {
            head1.next = null;
        }
    }

    public static ListNode getMiddle(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f!= null && f.next!= null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

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

    public static void display(ListNode node){
        while(node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        display(n1);
        reorder(n1);
        display(n1);
    }
}
