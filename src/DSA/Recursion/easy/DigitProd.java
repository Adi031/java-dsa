package DSA.Recursion.easy;

public class DigitProd {
    public static void main(String[] args) {
        int ans = prod(505 );
        System.out.println(ans);
    }
    static int prod(int n){
        if(n%10 == n){
            return 1;
        }
        return n%10 * prod(n/10);
    }
}
