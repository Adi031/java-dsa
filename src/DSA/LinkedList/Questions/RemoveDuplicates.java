package DSA.LinkedList.Questions;

public class RemoveDuplicates {
    public static void removeDuplicates(ListNode node){
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
    }

    public static void display(ListNode node){
        while(node!=null){
            System.out.print(node.val+" ->");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(5,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(1,n3);
        ListNode n1 = new ListNode(1,n2);

        display(n1);
        removeDuplicates(n1);
        display(n1);
    }
}
