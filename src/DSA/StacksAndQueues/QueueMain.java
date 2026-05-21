package DSA.StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(6);
//        queue.insert(62);
//        queue.insert(43);
//        queue.insert(65);
//        queue.insert(87);
//
//        queue.display();
//        System.out.println(queue.remove());

        CircularQueue queue1 = new CircularQueue(5);
        queue1.insert(8);
        queue1.insert(9);
        queue1.insert(21);
        queue1.insert(23);
        queue1.insert(43);

        queue1.display();
        System.out.println(queue1.remove());
        queue1.insert(6);
        queue1.display();
    }
}

