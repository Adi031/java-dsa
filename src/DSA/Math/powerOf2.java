package DSA.Math;

public class powerOf2 {
    public static void main(String[] args) {
        int n = 32;
        if (n==0){
            System.out.println("False");
        }
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }

}
