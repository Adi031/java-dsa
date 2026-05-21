package DSA.StacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(10);
        stack.push(19);
        stack.push(34);
        stack.push(56);
//        stack.push(90);  cannot push as stac is full

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        DynamicStack stack2 = new DynamicStack(5);

        stack2.push(9);
        stack2.push(23);
        stack2.push(34);
        stack2.push(54);
        stack2.push(93);
        stack2.push(65); // size of stack doubles

        System.out.println();
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }



}
