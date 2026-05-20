package DSA.LinkedList.Questions;

// linkedin, google, facebook, microsoft, amazon, apple
public class isPalindrome {
    public static boolean isPalindrome(ListNode head){
        ListNode mid = getMiddle(head);
        ListNode head2 = reverse(mid);
        mid = head2;
        while(head!= null && head2!= null){
            if(head.val != head2.val){
                break;
            }
            head = head.next;
            head2 = head2.next;
        }
        reverse(mid);
        return head == null || head2 == null;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static ListNode getMiddle(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        ListNode n6 = new ListNode(1);
        ListNode n5 = new ListNode(2,n6);
        ListNode n4 = new ListNode(3,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        System.out.println(isPalindrome(n1));

    }
}
