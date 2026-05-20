package DSA.LinkedList.Questions;

public class MergeSortedLists {
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
            System.out.print(node.val+" ->");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ListNode a3 = new ListNode(5);
        ListNode a2 = new ListNode(3,a3);
        ListNode list1 = new ListNode(1,a2);

        ListNode b3 = new ListNode(6);
        ListNode b2 = new ListNode(4,b3);
        ListNode list2 = new ListNode(2,b2);

        ListNode result = merge(list1,list2);

        display(result);
    }
}
