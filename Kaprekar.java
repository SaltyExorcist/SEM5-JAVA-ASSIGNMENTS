import java.util.*;
public class Kaprekar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int p = 0;
        int digit=0,sq,sum=0;
        sq = num*num;
        p=sq;
        while(sq>0) //counting no of digits
        {
            digit++;
            sq=sq/10;
        }
        int k=(int)Math.pow(10,(digit/2)); // Split the square at middle
        while(p>0)
        {
            sum=sum+(p%k);
            p=p/k;
        }
        if(sum==num){
            System.out.println("It is a Kaprekar number");
        }
        else{
            System.out.println("It is not a Kaprekar number");
        }
    }
}