package DSA.StacksAndQueues.Questions;

import java.util.Stack;
//Implementation of FIFO queue using two stacks
/*https://leetcode.com/problems/implement-queue-using-stacks/description/*/

public class QueueIFromStack {
    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(5);
        queue.add(23);
        queue.add(8);
        queue.add(9);

        System.out.println(queue.remove());
    }
}

// this is insert efficient implementation
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        if(second.isEmpty()){               // Optimization so that we don't have to transfer items again and again
            while (!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() throws Exception{
        if(second.isEmpty()){
            while (!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty() && second.isEmpty();
    }
}
