package OOP.Access.pkg1;

import OOP.Access.pkg1.Super;

public class Sub2 {
    public static void main(String[] args) {
        Super obj = new Super();
        // num1 is public so it can be used in anywhere
        int n1 = obj.num1;

        // num2 is private so it cannot be used in diff class in package
//        int n2 = obj.num2;

        // num3 is protected so it can be used by Class in the package
        int n3 = obj.num3;
        // num4 is default so cannot be used outside the package
        int n4 = obj.num4;
    }
}
