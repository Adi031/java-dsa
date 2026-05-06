package OOP.Interfaces.Nested;

public class A {

    public interface NestedInterface{
        boolean isOdd(int num);
    }
//    Nested interfae can be declared as private , public or protected but a standard interface can be only declared as private or default
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
