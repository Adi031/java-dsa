package DSA.Math;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors1(20);
        System.out.println();
        factors2(20);
    }
    static void factors1(int n){
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void factors2(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
