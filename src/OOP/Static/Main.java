package OOP.Static;

public class Main {
    public static void main(String[] args) {
        Human aditya = new Human(22, "Aditya" , 10000, false);
        Human aman = new Human(30, "Aman" , 15000, true);
        System.out.println(aditya.population);
        System.out.println(aman.population);
        System.out.println(Human.population); // better way to acces static variable
        fun();
    }
    // this is not dependent on objects
    static void fun(){
//        greeting();  you cant use this because it requires an instance
//         but the function you are using it in does not depend on instance

        // you cannot access non static stuf without referencing thier instances in static context

        // here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }
    // we know that something which is not static belongs to an object
    void greeting(){
        System.out.println("hello world");
    }
}
