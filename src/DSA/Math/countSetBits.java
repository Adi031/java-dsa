package DSA.Math;

public class countSetBits {
    public static void main(String[] args) {
        int n =7;
        System.out.println(setbits(n));
        System.out.println(setbits2(n));
    }
    public static int setbits(int n){
        int c = 0;
        while(n>0){
            c++;
            n -= (n&-n);
        }
        return c;
    }
    public static int setbits2(int n){
        int count = 0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static class PrimeNum {
        public static void main(String[] args) {
            System.out.println(isPrime(4));
        }
        static boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            int c = 2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }
            return true;
        }
    }
}
