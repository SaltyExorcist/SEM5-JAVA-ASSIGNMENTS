import java.util.Scanner;
public class TestException
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        try {
             setArray(array,5);
            } catch (NegativeSizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setArray(int[] a, int n) throws NegativeSizeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0) {
                throw new NegativeSizeException("Error: array elements cannot cannot be negative");
            }
        }
    }
}
