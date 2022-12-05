import java.util.*;
// Test driver class
public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person p = new Person("Rami Malek", "123 Main St");
        System.out.println(p.toString()); // Person[name=John Doe,address=123 Main St]

        // Create a Student object
        Student2 s = new Student2("Subhrojyoti Neogi", "62 Chandi Ghosh Road", "Computer Science", "Junior", 6000.0);
        System.out.println(s.toString());

        Staff st = new Staff("Tania Debbarma", "88 Thakurpara Road", "NNDC", 50000.0);
        System.out.println(st.toString());
    }
}
