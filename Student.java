import java.util.*;
public class Student {
    private int id;
    private String name;

    // Parameterized constructor that initializes the id and name of the student.
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method that checks whether the given objects are equal.
    public boolean isEqual(Student other) {
        if (other == null) {
            return false;
        }
        return this.id == other.id && this.name.equals(other.name);
    }

    public static void main(String args[])
    {
        Student std1 = new Student(7,"Raj Neogi");
        Student std2 = new Student(7,"Raj Neogi");
        boolean b=std1.isEqual(std2);
        if(b)
            System.out.println("Both are equal");
        else
            System.out.println("Both are different");

    }
}
