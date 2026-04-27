package CoreJava.Strings;
public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for(int i=1;i<26;i++){
            char ch = (char)('a'+i);
            series += ch;
        }
        System.out.println(series);
    }
}