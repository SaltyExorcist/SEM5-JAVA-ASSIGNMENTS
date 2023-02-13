import java.util.*;
// Define a class that implements the Engine interface
public class VehicleEngine implements Engine {
    // Private fields for the speed and gear of the engine
    private int speed;
    private int gear;

    // Implement the speedUp() method from the Engine interface
    public void speedUp(int value) {
        // Increase the speed of the engine by the specified value
        speed += value;
    }

    // Implement the changeGear() method from the Engine interface
    public void changeGear(int value) {
        // Change the gear of the engine to the specified value
        gear = value;
    }
    public void display()
    {
        System.out.println("Speed: " + this.speed);
        System.out.println("Gear: " + this.gear);
    }

    public static void main (String[] args)
    {
        try
        {
            VehicleEngine obj1 = new VehicleEngine();
            obj1.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }

// instance variables here

    public void run (String[] args) throws Exception
    {
        Engine obj=new VehicleEngine();
        obj.speedUp(60);
        obj.changeGear(3);
        obj.display();

    }
}
