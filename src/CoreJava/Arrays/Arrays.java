package CoreJava.Arrays;

public class Arrays {
    public static void main(String[] args) {
//         Syntax of array :
//         datatype [] variable_name = new datatype [size]
//        store 5 roll nos :
//        int [] roll_no = new int[5];
//        OR
//        int [] rollno = {12,23,43,56,32};
        int [] arr ;  // declaration of array.
        arr = new int[5] ; // Initialisation: here object is being created in the heap
        System.out.println(arr[1]);
        String [] ar = new String[5];
        System.out.println(ar[1]);

    }
}