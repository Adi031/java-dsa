package DSA.LinkedList;

public class Driver {
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertLast(6);
        list.display();

        list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}
