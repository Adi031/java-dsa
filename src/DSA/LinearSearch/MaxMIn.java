package DSA.LinearSearch;
public class MaxMIn {
    public static void main(String[] args) {
        int [] arr = {65,99,64,23,44,12,2,98,12,0};
        System.out.println(findmax(arr));
        System.out.println(findmin(arr));
    }
    static int findmax(int[] a){
        int max = a[0];
        for(int x: a){
            if(x>max){
                max = x;
            }
        }
        return max;
    }
    static int findmin(int[] a){
        int min= a[0];
        for(int x: a){
            if(x<min){
                min= x;
            }
        }
        return min;
    }
}