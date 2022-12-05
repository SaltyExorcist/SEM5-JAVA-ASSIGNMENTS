import java.util.*;
// Subclass Staff
public class Staff extends Person {
    // Instance variables
    private String school;
    private double pay;

    // Constructor to initialize Staff and Person variables
    public Staff(String name, String address, String school, double pay) {
        super(name, address); // Call the superclass constructor
        this.school = school;
        this.pay = pay;
    }

    // Method to update Staff and Person variables
    public void setStaff(String name, String address, String school, double pay) {
        super.setPerson(name, address); // Call the superclass method
        this.school = school;
        this.pay = pay;
    }

    // Method to return Person-Staff details as a string
    public String toString() {
        return super.toString() + ",School=" + school + ",Pay=" + pay;
    }
}
