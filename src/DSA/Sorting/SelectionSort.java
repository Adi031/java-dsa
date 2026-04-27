package DSA.Sorting;

import java.util.Arrays;

public class  SelectionSort {
    public static void main(String[] args) {
        int []arr = {1,8,6,3,-5,0,7,6,5};
        selectionsort(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void selectionsort(int[]a){
        for(int i=0;i<a.length;i++){
            int last = a.length-i-1;
            int max = getmaxindex(a,0,last);
            swap(a,max,last);
        }
    }
    static void swap(int[]a,int max, int last){
        int temp = a[max];
        a[max] = a[last];
        a[last] = temp;
    }
    static int getmaxindex(int[]a,int start ,int end){
        int max =0;
        for(int i=start;i<=end;i++){
            if(a[i]>a[max]){
                max = i;
            }
        }
        return max;
    }
}