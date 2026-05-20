package DSA.LinkedList.Questions;

public class MiddleOfLL {
    public static ListNode findMiddle(ListNode head){
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
//        ListNode n6 = new ListNode(5);
        ListNode n5 = new ListNode(8);
        ListNode n4 = new ListNode(10,n5);
        ListNode n3 = new ListNode(45,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(6,n2);

        ListNode middle = findMiddle(n1);
        System.out.println(middle.val);

    }
}
