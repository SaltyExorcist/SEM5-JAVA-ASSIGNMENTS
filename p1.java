import java.util.*;
public class p1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System. in);

        double n, a,i, f=1,pow=0,sum=1;
        System. out.println("Enter the number a:");
        a=sc.nextDouble();
        System. out.println("Enter the number n:");
        n=sc.nextDouble();

        for(i=1; i<=n; i++)
        {
            pow=Math.pow(-1,i);
            sum=sum+pow*Math.pow(a,i);
        }
        System. out.println( "Sum = "+sum);
    }
}