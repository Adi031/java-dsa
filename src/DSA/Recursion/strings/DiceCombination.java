package DSA.Recursion.strings;

import java.util.ArrayList;

public class DiceCombination {
    public static void main(String[] args) {
        System.out.println(diceRet("",4));
    }

    static void dice(String p, int up){
        if(up == 0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=up ;i++){
            dice(p+i,up-i);
        }
    }

    static ArrayList<String> diceRet(String p, int up){
        if(up == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6 && i<=up ;i++){
            list.addAll(diceRet(p+i,up-i));
        }
        return list;
    }
}
