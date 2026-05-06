package OOP.Access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Aditya");
        // need to do a few things
        // 1.access the data members
        // 2.modify the data members
//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;
        obj.getNum();
        int n = obj.num;
        // if num -> private it cannot be accessed outside
        // if num -> public it can be accessed everywhere
        // if nothing mentioned -> default it can be accessed in same package but not in different package


    }
}

