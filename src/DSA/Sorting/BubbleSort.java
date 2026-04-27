package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {1,4,5,7,8};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[]a){
        boolean swapped ;
        for(int i=0;i<a.length;i++){
            swapped = false;
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp =a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}