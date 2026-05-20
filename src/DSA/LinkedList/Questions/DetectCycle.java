package DSA.LinkedList.Questions;

// Amazon and Microsoft
public class DetectCycle {
    public static boolean hasCycle(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

//    Fast and Slow pointer method: we take two pointers and traverse both of them , slow pointer with 1 step at a time
//    and fast pointer with 2 step at a time. If there is a cycle these pointer meet at some point and if cycle is not
//    present then fast pointer becomes null earlier.

    public static int lengthCycle(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                } while(temp!= slow);
                return length;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        ListNode n6 = new ListNode(9);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(7,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(4,n3);
        ListNode n1 = new ListNode(1,n2);
        n6.next = n3;
        boolean cycle = hasCycle(n1);
        if(cycle){
            System.out.println("Cycle Present");
        }
        else{
            System.out.println("Cycle not Present");
        }

        System.out.println(lengthCycle(n1));
    }
}
