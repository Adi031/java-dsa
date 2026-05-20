package DSA.LinkedList.Questions;

public class StartNodeOfCycle {
    public static ListNode startNode(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while (temp!= slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        ListNode f = node;
        ListNode s = node;
        while (length>0){
           s = s.next;
           length--;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
    public static void main(String[] args) {
        ListNode n6 = new ListNode(9);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(7,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(4,n3);
        ListNode n1 = new ListNode(1,n2);
        n6.next = n3;

        ListNode start = startNode(n1);
        System.out.println(start.val);
    }
}
