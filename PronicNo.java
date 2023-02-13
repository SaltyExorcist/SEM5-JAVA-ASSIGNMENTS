import java.util.Scanner;
public class PronicNo
{
    public void pronicCheck() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = in.nextInt();
        boolean isPronic = false;

        for (int i = 1; i <= num - 1; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }

        if (isPronic)
            System.out.println(num + " is a pronic number");
        else
            System.out.println(num + " is not a pronic number");
    }
    public static void main(String args[])
    {
        PronicNo obj=new PronicNo();
        obj.pronicCheck();
    }
}

/*
Pronic number is the number which is the product of two consecutive integers.
Examples:
12 = 3 * 4
20 = 4 * 5
42 = 6 * 7
 */