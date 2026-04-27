package CoreJava.Arrays;
public class Max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,12,15};
        System.out.println("Max element in array is " + findmax(arr));
        System.out.println("Max element btw index 1 and 4 is "+ maxRange(arr ,1,4));
    }
    // Work on edge cases here , like if array is null or something else..
    static int findmax(int[] a){
        if(a.length ==0){
            return -1;
        }
        int max = a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    static int maxRange(int[] a,int start , int end){
        int max = a[start];
        for(int i=start;i<=end;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}