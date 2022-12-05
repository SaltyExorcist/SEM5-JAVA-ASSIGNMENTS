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
         Square obj1=new Square(3);
         Cylinder obj2=new Cylinder(3,5);
         double vol1=obj1.getVolume();
        double vol2=obj2.getVolume();
        System.out.println("The volume of the square: "+vol1);
        System.out.println("The volume of the cylinder: "+vol2);
    }
}
