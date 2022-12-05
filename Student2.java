import java.util.*;
// Subclass Student
public class Student2 extends Person {
    // Instance variables
    private String program;
    private String year;
    private double fees;

    // Constructor to initialize Student and Person variables
    public Student2(String name, String address, String program, String year, double fees) {
        super(name, address); // Call the superclass constructor
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    // Method to update Student and Person variables
    public void setStudent(String name, String address, String program, String year, double fees) {
        super.setPerson(name, address); // Call the superclass method
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    // Method to return Person-Student details as a string
    public String toString() {
        return super.toString() + ",Program=" + program + ",Year=" + year + ",Fees=" + fees;
    }
}