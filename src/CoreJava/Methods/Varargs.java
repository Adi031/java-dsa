package CoreJava.Methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,10);
        multiple(10,20,"Aditya","Aman");
    }

    private static void multiple(int a, int b, String...v ) {

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}