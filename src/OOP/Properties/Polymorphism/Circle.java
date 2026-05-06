package OOP.Properties.Polymorphism;

public class Circle extends Shapes {
    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override
     void area(){
        System.out.println("Area is pi * r * r");
    }

    @Override
    void greeting(){
        System.out.println("I am in Child Class");
    }
}
