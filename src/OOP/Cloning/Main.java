package OOP.Cloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human aditya = new Human(23,"Aditya");
//        Human twin = new Human(aditya);

        Human twin = (Human)aditya.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 77;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(aditya.arr));



    }

}
