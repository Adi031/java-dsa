package DSA.Math;

public class find_ith_bit {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int  mask = (1<<(i-1));
        if((n&mask)==0){
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }
//        Method - 2 move the ith bit of n to rightmost
        if(((n>>(i-1))&1)==1){
            System.out.println("Bit is 1");
        }
        else{
            System.out.println("Bit is 0");
        }
    }
}
