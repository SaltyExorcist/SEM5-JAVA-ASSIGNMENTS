import java.util.Scanner;
public class BuzzNo
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
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
//Buzz is a no which is divisible by 7 or ends with 7.