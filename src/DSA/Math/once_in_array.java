package DSA.Math;

public class once_in_array {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,3,2,6,4,1};
        int unique = 0;
        for (int n: arr){
            unique ^= n;
        }
        System.out.println("Number appearing once is "+ unique);
    }
}
