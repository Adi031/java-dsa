package DSA.BinarySearch;
public class Q3_SmallestLetter {
    public static void main(String[] args) {
        char [] letters = {'a','c','d','e','k','p','r','r',};
        char target = 'r';
        int smallest = smallest(letters,target);
        if(smallest<letters.length){
            System.out.println(letters[smallest]);
        }
        else {
            System.out.println("Doesn't exist.");
        }
    }
    static int smallest(char[] letters,char target){
        int s = 0;
        int e = letters.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if (target<letters[mid]){
                e = mid-1;
            }
            else  {
                s = mid+1;
            }
        }
        return (s%letters.length);
    }
}