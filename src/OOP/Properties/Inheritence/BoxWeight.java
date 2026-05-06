package OOP.Properties.Inheritence;

public class BoxWeight extends Box {
    double weight ;
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double l , double h, double w, double weight){
        super(l,h,w); // call the parent class constructor
        // used to initialize values present in parent class

//        System.out.println(super.weight); to call the weight from superclass
        System.out.println("Child class constructor");

        this.weight = weight;

    }
}
