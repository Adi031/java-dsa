package DSA.Recursion.intro;

public class Recursion {
    public static void main(String[] args) {
       print(1);
    }
    static void print(int n){
        System.out.println(n);
//        Base Condition:
        if(n==5){
            return;
        }
//        Recursive call:
//        this is tail recursion..
//        this is last function call.
        print(n+1);
    }
}
