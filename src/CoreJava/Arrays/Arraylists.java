package CoreJava.Arrays;
import java.util.*;
public class Arraylists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax :
        ArrayList<Integer> list = new ArrayList<>(10) ;
        list.add(67);
        list.add(7);
        list.add(6);
        list.add(23);
        System.out.println(list.contains(67));
        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
        // Input
        for(int i=0;i<4;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        // Output
        for(int i=0;i<4;i++){
            System.out.println(list.get(i));
        }

    }
}