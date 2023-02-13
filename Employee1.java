import java.util.*;
public abstract class Employee1 {
    protected String name;
    protected float salary;

     public Employee1(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract float netSalary();

    public void display() {
        System.out.println("Employee: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Net salary: " + this.netSalary());
    }
}



