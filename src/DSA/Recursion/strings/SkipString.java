package DSA.Recursion.strings;

public class SkipString {
    public static void main(String[] args) {
        String str = "baccad";
//        String p = "";
//        skip(p,str);
        String res = skip(str);
        System.out.println(res);
        String res1 = skipString("baccApplede","Apple");
        System.out.println(res1);
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch =='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch+ skip(up.substring(1));
        }
    }

    static String skipString(String up, String str){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(str)){
            return skipString(up.substring(str.length()),str);
        }
        else {
            return up.charAt(0)+skipString(up.substring(1),str);
        }
    }
}
