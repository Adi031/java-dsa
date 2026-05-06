package OOP.Abstract;

public abstract class Parent {
    abstract void career();
    abstract void partner();

    int age;

    public Parent(int age){
        this.age = age;
    }
    void normal(){
        System.out.println("This is a normal method");
    }

    static void hello(){
        System.out.println("Hello");
    }
}
