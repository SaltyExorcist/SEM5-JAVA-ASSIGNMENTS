import java.util.Scanner;

public class ExceptionHandler {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            // This line of code will throw an ArrayIndexOutOfBoundsException if
            // the specified index is greater than or equal to the length of the array.
            int value = array[10];
            // This line of code will throw an ArithmeticException if the denominator
            // is zero.
            int result = 15 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: array index out of bounds");
            System.err.println("Cause: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error: arithmetic exception");
            System.err.println("Cause: " + e.getMessage());
        }
    }

    public static class BuzzNumber
    {
        public static void main(String[] args)
        {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n=");
            n = sc.nextInt();
            if (n % 10 == 7 || n % 7 == 0)
            {
                System.out.println("Buzz number");
            }
            else
            {
                System.out.println("Not Buzz number");
            }
        }
    }
}
