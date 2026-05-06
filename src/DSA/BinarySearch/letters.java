package DSA.BinarySearch;

public class letters {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
            int s = 0;
            int e = letters.length-1;
            while(s<=e){
                int mid = s+(e-s)/2;
                if(letters[mid] == target && mid < letters.length-1){
                    return letters[mid+1];
                }
                else if(letters[mid]>target){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            if(s<letters.length && letters[s]>target){
                return letters[s];
            }
            else{
                return letters[0];
            }
        }
}
