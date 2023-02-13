import java.util.*;
public class Clerk extends Employee1 {
    protected float overtime;

    public Clerk(String name, float salary, float overtime) {
        super(name, salary);
        this.overtime = overtime;
    }

    public float netSalary() {
        return this.salary + this.overtime * 1.5f;
    }

    public void display() {
        super.display();
        System.out.println("Overtime: " + this.overtime);
    }
}
