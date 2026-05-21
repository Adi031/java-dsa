package DSA.StacksAndQueues;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(123);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(mystack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        queue.add(12);
        queue.add(24);

        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(9);
        deque.addLast(67);
        deque.removeFirst();
        deque.removeLast(); //etc...
    }
}
