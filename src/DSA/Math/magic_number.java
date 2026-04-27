package DSA.Math;

public class magic_number {
    public static void main(String[] args) {
        int n = 2;
        int magic = 0;
        int base = 5;
        while(n>0){
          int digit = n&1;
          magic += digit*base;
          base *=5;
          n = n>>1;
        }
        System.out.println(magic);
    }
}
