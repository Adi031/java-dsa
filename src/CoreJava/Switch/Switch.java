package CoreJava.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit name");
        String fruit = in.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits.");
            case "Apple" -> System.out.println("A sweet red fruit.");
            case "Orange" -> System.out.println("A round  fruit.");
            case "Grapes" -> System.out.println("A small fruit.");
            default -> System.out.println("Enter a valid fruit..");
        }
    }
}