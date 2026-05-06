package OOP.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes obj = new Circle();
        obj.area();
        obj.greeting(); // Dynamic Method Dispatch
    }
}
