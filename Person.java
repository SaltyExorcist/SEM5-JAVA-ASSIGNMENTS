import java.util.*;
// Superclass Person
public class Person {
    // Instance variables
    private String name;
    private String address;

    // Constructor to initialize Person variables
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method to update Person variables
    public void setPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method to return Person details as a string
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
