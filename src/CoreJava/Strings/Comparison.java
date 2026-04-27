package CoreJava.Strings;
public class Comparison {
    public static void main(String[] args) {
        String a = "Aditya";
        String b = "Aditya";
        String c = a;
//        1st method to compare is by using ==
//        It checks if the refernce variable is pointing to the same object or not.
        System.out.println(a==b);                   // true
        System.out.println(c==a);                   // true
//       Creating diff objects with same value.
        String x = new String("Object");
        String y = new String("Object");
        System.out.println(x==y);                   // false
//        2nd method ti compare is by using .equals method
//        It only checks the value
        System.out.println(x.equals(y));            // true
        String z = x;
        System.out.println(x==z);                   // true
    }
}