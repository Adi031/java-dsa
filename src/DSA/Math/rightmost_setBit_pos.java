package DSA.Math;

public class rightmost_setBit_pos {
    public static void main(String[] args) {
        int n = 14;
        if(n==0){
            System.out.println("No set bit");
        }
        int value = n & -n;
        int pos = 1;
        while(value>1){
            value = value>>1;
            pos++;
        }
        System.out.println(pos);
    }
}
