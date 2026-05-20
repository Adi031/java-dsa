package DSA.LinkedList.Questions;

public class ReverseKNodes {
    public static ListNode reverseKNodes(ListNode head, int k){
        if(k<=1 || head == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(true){
          ListNode last = prev;
          ListNode newEnd = curr;
          ListNode temp = curr;
          int count = 0;
          while (temp != null && count < k) {
              temp = temp.next;
              count++;
          }

          // If fewer than k nodes remain, stop
            if (count < k) {
                break;
            }

          for(int i=0; curr != null && i<k; i++){
              ListNode next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }

          if(last!=null){
              last.next = prev;
          }
          else{
              head = prev;
          }
          newEnd.next = curr;;

          if(curr == null){
              break;
          }
          prev = newEnd;
        }
        return head;
    }
}
