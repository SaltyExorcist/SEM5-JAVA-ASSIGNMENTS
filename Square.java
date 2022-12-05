import java.util.*;
public class Square {
    private double side;

    // Constructor that initializes the side of the square.
    public Square(double side) {
        this.side = side;
    }

    // Method that calculates the volume of the square.
    public double getVolume() {
        return Math.pow(this.side, 3);
    }
}
