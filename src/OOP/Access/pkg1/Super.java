package OOP.Access.pkg1;

public class Super {
    public int num1;
    private int num2;
    protected int num3;
    int num4;

    public static void main(String[] args) {
        Super obj = new Super();
        // everything is in same class so everything is accessible
        int n1 = obj.num1;
        int n2 = obj.num2;
        int n3 = obj.num3;
        int n4 = obj.num4;

    }
}
