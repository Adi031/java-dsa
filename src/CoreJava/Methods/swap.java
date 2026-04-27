package CoreJava.Methods;
public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // swap code:
        // int temp = a;
        // a = b;
        // b = temp;
        swap(a,b);
        System.out.println(a+" "+b);
        String name = "Aditya";
        change(name);
        System.out.println(name);
    }

    static void change(String name) {
        name = "Aditya Kumar Rajpoot";
    }

    static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = a;      // doesn't swap original values
        // values are swapped at function scope only..
    }
}