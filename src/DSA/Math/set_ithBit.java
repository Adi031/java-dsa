package DSA.Math;

public class set_ithBit {
    public static void main(String[] args) {
        int n = 10;
        int bit = 3;
        int mask = 1<<(bit-1);
        n = n | mask;
        System.out.println(n);
    }
}
