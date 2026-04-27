package DSA.Recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,6,5,9,8,13,7};
//        int[]sorted = mergeSort(arr);
//        System.out.println(Arrays.toString(sorted));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[]arr,int s, int e){
        if(e-s==1){
            return;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){
        int i = s;
        int j = m;
        int k = 0;
        int []merged = new int[e-s];

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                merged[k] = arr[i];
                i++;
            }
            else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            merged[k] = arr[j];
            j++;
            k++;
        }
        for(int r = 0;r<merged.length;r++){
            arr[s+r] = merged[r];
        }
    }


    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[]a,int[]b){
        int i=0;
        int j=0;
        int k=0;
        int[] res = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                i++;
            }
            else{
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
}
