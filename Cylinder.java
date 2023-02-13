import java.util.*;
public class Cylinder extends Square {
    private double height;

    // Constructor that initializes the side and height of the cylinder.
    public Cylinder(double side, double height) {
        super(side);
        this.height = height;
    }

    // Overridden method that calculates the volume of the cylinder.
    // It uses the side of the square as the radius of the cylinder.
    public double getVolume() {
        return super.getVolume() * this.height;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,h;
        System.out.println("Enter the side of the square:");
        s=sc.nextInt();
        System.out.println("Enter the height of the cylinder:");
        h=sc.nextInt();
         Square obj1=new Square(s);
         Cylinder obj2=new Cylinder(s,h);
         double vol1=obj1.getVolume();
        double vol2=obj2.getVolume();
        System.out.println("The volume of the square: "+vol1);
        System.out.println("The volume of the cylinder: "+vol2);
    }
}
