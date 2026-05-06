package OOP.EnumExample;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, THursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public , static and final
        // since its final you can not create child enums
        // type is week

        Week(){
            System.out.println("Constructor called for "+this);
        }

        // this is not public or protected , only private or default
        // Why? we don't want to create new objects
        // because this is not the enum concept

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week);
    }
}
