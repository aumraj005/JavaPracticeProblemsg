import java.util.Scanner;
class Student{
    String Name;
    int Rollno;
    Student(String Name ,int rollno){ // Constructor
        this.Name = Name; // Instance Variable
        this.Rollno = Rollno;  // Instance Variable
    }
}
public class Numbers {
    public static void main(String[] args) {
        Student st = new Student("Raj", 521);
        System.out.println(st.Name);
    }
}

