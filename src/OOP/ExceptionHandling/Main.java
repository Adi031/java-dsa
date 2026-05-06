package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            divide(a,b);

            String name = "Aditya";
            if(name.equals("Aditya")){
                throw new MyException("Name is Aditya");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always run");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please don't divide by zero");
        }
        return a / b;
    }
}
