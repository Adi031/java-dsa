package DSA.LinearSearch;
public class Searching {
    public static void main(String[] args) {
        int [] arr = {1,2,3,12,7,45,34,23,21};
        int target = 12;
        int index = search(arr,target);
        if(index!=-1) {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    static int search(int[] a , int element){
        if(a.length==0){
            return -1;
        }
        // run a for loop to search for the target element.
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                return i;
            }
        }
        // this line will execute if none of the above return statements run i.e, target not found.
        return -1;
    }
}