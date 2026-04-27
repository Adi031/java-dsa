package CoreJava.Strings;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted numeber is %.2f",a);
        System.out.println();
        System.out.printf("Pie : %.3f",Math.PI);
        System.out.println();
        System.out.printf("My name is %s %s","Aditya","Rajpoot");
        System.out.println();
        System.out.println("a"+1);
        System.out.println("Aditya"+ new ArrayList<>());
    }
}