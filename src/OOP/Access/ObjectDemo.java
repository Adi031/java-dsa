package OOP.Access;

public class ObjectDemo {

    int num;
    double gpa;
    ObjectDemo(int num , double gpa){
        this.num = num;
        this.gpa = gpa;
    }

    // already covered
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    // In hashmaps
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return this.num== ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone () throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,10.6);
        ObjectDemo obj2 = new ObjectDemo(34,5.7);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        // hashcode is a unique representation of an object through a number
        // it's not the address

        ObjectDemo o1 = new ObjectDemo(12,57.8);
        ObjectDemo o2 = new ObjectDemo(12,45.6);

        if(o1 == o2){
            System.out.println("O1 is equal to O2");
        }

        if(o1.equals(o2)){
            System.out.println("O1 is equal to O2");
        }

        System.out.println(o1.getClass().getName());
    }
}
