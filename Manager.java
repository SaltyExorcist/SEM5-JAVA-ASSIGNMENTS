import java.util.*;
public class Manager extends Employee1 {
    protected float bonus;

    public Manager(String name, float salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public float netSalary() {
        return this.salary + this.bonus;
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + this.bonus);
    }
}
/*
Output:

 */