package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();

        Daughter daughter = new Daughter(24);
        daughter.career();

        son.normal();
        System.out.println(daughter.age);

        Parent.hello();
        // Parent mom = new Parent();   Not possible to make objects of Abstract classes
    }

}
