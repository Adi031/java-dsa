// Q- Given an array of nums of integers , return how many of them contain even number of digits.
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package DSA.LinearSearch;

public class evenNumofDigits {
    public static void main(String[] args) {
        int [] nums = {12,234,-2134,9876,1,90,54321};
        System.out.println("items that contain even number of digits are: "+evenNumofDigits(nums));

    }
    static int evenNumofDigits(int [] a){
        int count = 0;
        for(int i:a){
            int numofdigits = 0;
            if(i<0){
                i = i*-1;
            }
            else if(i==0){
                numofdigits = 1;
            }
            while(i>0){
                numofdigits++;
                i=i/10;
            }
            if(numofdigits%2 ==0){
                count++;
            }
        }
        return count;
    }
    // solution 2 :
    static int evenNumofDigits2(int[] a){
        int count =0;
        for(int i:a){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int digits = digits(num);
        if(digits%2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        if(num<0){
            num = num*-1;
        }
        if(num ==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    // Shortcut to get number of digits in a number:
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}