package DSA.LinkedList;

public class LL1 {
    private Node head;

    // ================= INSERT OPERATIONS =================
    // Insertion at the beginning of the list
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    // Insertion at the end of the list
    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    // ================= DELETE OPERATIONS =================
    // Deletion at beginning of the list
    public void deleteFirst(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        System.out.println("Deleted "+head.value );
        head = head.next;
    }

    // Deletion at end of the list
    public void deleteLast(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }

        if(head.next == null){
            System.out.println("Deleted "+head.value);
            head = null;
            return;
        }

        Node node = head;
        Node p = null;

        while(node.next!=null){
            p = node;
            node = node.next;
        }

        System.out.println("Deleted "+node.value);
        p.next = null;
    }

    // Display the content of list
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
    private class Node{
        int value;
        Node next;

        private Node(int val){
            this.value = val;
        }
    }
}
