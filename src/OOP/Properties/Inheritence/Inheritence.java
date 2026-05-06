package OOP.Properties.Inheritence;

public class Inheritence {
    public static class Species{
        int age;
        public Species(int age){
            this.age = age;
        }
    }

    public static class Human extends Species{
        String name ;

        public Human(int age, String name) {
            super(age);
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Human obj = new Human(22,"Aditya");
        System.out.println(obj.age);
        System.out.println(obj.name);

    }
}
