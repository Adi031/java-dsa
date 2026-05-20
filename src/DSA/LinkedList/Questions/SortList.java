package DSA.LinkedList.Questions;

public class SortList {
    public static ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }

    public static ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static ListNode merge (ListNode list1, ListNode list2){
        ListNode tempHead = new ListNode();
        ListNode tempTail = tempHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tempTail.next = list1;
                list1 = list1.next;
                tempTail = tempTail.next;
            }
            else{
                tempTail.next = list2;
                list2 = list2.next;
                tempTail = tempTail.next;
            }
        }
        while(list1 != null){
            tempTail.next = list1;
            list1 = list1.next;
            tempTail = tempTail.next;
        }
        while(list2 != null){
            tempTail.next = list2;
            list2 = list2.next;
            tempTail = tempTail.next;
        }
        return tempHead.next;
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

        ListNode node = sortList(n1);
        display(node);

    }
}
