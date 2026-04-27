package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {4,2,7,9,0,1,3,6,4,5};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j-1]>a[j]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}