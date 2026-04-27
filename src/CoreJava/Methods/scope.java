package CoreJava.Methods;
public class  scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println(c);     cannot access c due to function scope
        {
//            int a = 100;      values initialized outside the block cannot be re-initialized inside the block.
              a = 100;          //  values initialized outside the block can be updated inside the block.
              int x = 40;
              // values initialized inside the block will remain in this block.
        }
//        x = 50;               values initialized inside the block cannot be modified outside the block.
        int x = 40;             // values initialized inside the block can be re-initialized outside the block.
//        System.out.println(x);    cannot access x due to block scope
        // loop scope
        for(int i =0; i<5;i++){
//            System.out.println(i);
            int num = 100;
            a = 1000;
        }
//        System.out.println(num);  values initialized inside loop cannot be used outside.
    }
    static void method(){
        int c = 40;
    }
}