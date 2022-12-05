public class Employee
{
    private String name;
    private double salary;
    private double pf;
    private double allowance;

    // Default constructor
    public Employee() {
        this.name = "";
        this.salary = 0.0;
        this.pf = 0.0;
        this.allowance = 0.0;
    }

    // Constructor with parameters
    public Employee(String name, double salary, double pf, double allowance) {
        this.name = name;
        this.salary = salary;
        this.pf = pf;
        this.allowance = allowance;
    }

    public Employee calculate() {
        // Calculate pf and allowance
        double pf = this.salary * 0.12;
        double allowance = this.salary * 0.4;

        // Return values as an object
        return new Employee(this.name, this.salary, pf, allowance);
    }

    public void display()
    {
        System.out.println("employee name:"+name);
        System.out.println("employee salary:"+salary);
        System.out.println("employee pf:"+pf);
        System.out.println("employee allowance:"+allowance);
    }

    public static void main(String args[])
    {
        Employee employee = new Employee("John Doe", 5000.0, 0.0, 0.0);
        Employee result = employee.calculate();
        result.display();
    }
}
