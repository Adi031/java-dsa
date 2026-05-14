package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(1);
        list.insertFirst(3);
        list.display();

        list.insertLast(9);
        list.display();

        list.insertAt(7,3);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

        DLL dlist = new DLL();
        dlist.insertFirst(1);
        dlist.insertFirst(5);
        dlist.insertFirst(9);
        dlist.display();

        dlist.insertLast(7);
        dlist.display();

        dlist.insert(9,8);
        dlist.insert(7,2);
        dlist.display();

        CLL clist = new CLL();
        clist.insert(9);
        clist.insert(20);
        clist.insert(15);
        clist.insert(30);
        clist.display();
        clist.delete(9);
        clist.display();


    }
}
