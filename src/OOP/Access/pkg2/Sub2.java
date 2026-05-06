package OOP.Access.pkg2;

import OOP.Access.pkg1.Super;

public class Sub2 {
    public static void main(String[] args) {
        Super obj = new Super();
        // num1 is public so it can be used in a class in diff package
        int n1 = obj.num1;

        // num2 is private so it cannot be used in diff package
//        int n2 = obj.num2;

        // num3 is protected so it canot be used in a class (not subclass) in diff package
//        int n3 = obj.num3;

        // num4 is default so cannot be used outside the pckage
//        int n4 = obj.num4;
    }
}
