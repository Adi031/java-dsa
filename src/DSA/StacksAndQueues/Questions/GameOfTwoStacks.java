package DSA.StacksAndQueues.Questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxSum = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(twoStacks(maxSum,a,b));

    }

    static int twoStacks(int maxSum, int[]a,int[]b){
        return twoStacks(maxSum,a,b,0,0);
    }

    // this approach is not optimal it will fail for large sizes of arrays ( !TLE error! )
    static int twoStacks(int maxSum, int[]a, int[]b, int curr, int score){
        if(curr>maxSum){
            return score-1;
        }
        int ans1 = score;
        int ans2 = score;

        if(a.length != 0){
            ans1 = twoStacks(maxSum, Arrays.copyOfRange(a,1,a.length),b,curr+a[0],score+1);
        }
        if(b.length != 0){
            ans2 = twoStacks(maxSum, a,Arrays.copyOfRange(b,1,b.length),curr+b[0],score+1);
        }
        return Math.max(ans1,ans2);
    }

}
