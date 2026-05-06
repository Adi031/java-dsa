package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.accelerate();
        car.start();
        car.stop();

        Engine car1 = new Car();
        // this works for interfaces as well (DMD)

//        Media carmedia = new Car();      creates problem
//        carmedia.stop();

        NiceCar mycar = new NiceCar();
        mycar.start();
        mycar.stop();
        mycar.startMusic();
    }
}
