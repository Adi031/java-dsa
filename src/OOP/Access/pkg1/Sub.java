package OOP.Access.pkg1;

public class Sub extends Super{
    public static void main(String[] args) {
        Sub obj  = new Sub();
       int n1 =  obj.num1;
//       int n2 =  obj.num2; // its private so we cannot access it outside the class
       int n3 =  obj.num3;
       int n4 = obj.num4;
    }
}
