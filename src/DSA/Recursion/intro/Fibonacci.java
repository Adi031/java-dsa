package DSA.Recursion.intro;
public class Fibonacci {
    public static void main(String[] args) {
//        Assuming 0 is 0th fibonacci..
        System.out.println(Fibonacci(4));
    }
    static int Fibonacci(int n){
        if(n<2){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2); // not a tail recursion
    }

}