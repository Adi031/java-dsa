package CoreJava.Methods;
public class return_string {
    public static void main(String[] args) {
       String greet = greeting();
        System.out.println(greet);
    }
    static String greeting(){
        String greeting = "Hello";
        return greeting;
//        return "Hello";
    }
}