package OOP.Interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void start(){
        System.out.println("Starts Engine like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("Stops Engine like a normal car");

    }

    @Override
    public void accelerate(){
        System.out.println("Accelerates like a normal car");
    }

    @Override
    public void brake(){
        System.out.println("Brakes like a normal car");

    }


}
