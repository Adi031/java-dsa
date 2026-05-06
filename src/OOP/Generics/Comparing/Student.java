package OOP.Generics.Comparing;


import java.util.Arrays;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger
        // else: o is smaller
    }

    @Override
    public String toString(){
        return marks + " " + rollno;
    }

    public static void main(String[] args) {
        Student aditya = new Student(12,88.5f);
        Student aman = new Student(5,98.5f);
        Student arnav = new Student(25, 91.2f);
        Student rohan = new Student(7, 84.7f);
        Student alex = new Student(30, 95.8f);
        Student vikram = new Student(14, 67.9f);

        Student[] list = {aditya, aman, arnav, rohan, alex, vikram};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(aman.compareTo(aditya) > 0){
//            System.out.println("Aman has more marks");
//        }
    }
}
