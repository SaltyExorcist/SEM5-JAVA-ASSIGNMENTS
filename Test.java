import java.util.*;
public class Test {
    public static void main(String[] args)
    {
        Employee1 s1 = new Manager("Raj", 50000.00f, 10000.00f);
        Employee1 s2 = new Clerk("Raju", 25000.00f,50.00f);
        s1.display();
        s2.display();
    }
}
