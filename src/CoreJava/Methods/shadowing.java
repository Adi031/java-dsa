package CoreJava.Methods;
public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x = 40;             // (upper level variable is  shadowed by lower level variable)
        System.out.println(x);  // 40
        fun();                  // 90
    }

    private static void fun() {
        System.out.println(x);
    }
}