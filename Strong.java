import java.util.Scanner;
public class Strong
{
    public static void main(String[] args)
    {
        Strong s1=new Strong();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=in.nextInt();
        int check=s1.check_strong(number);
        if(check==number)
            System.out.println(number+" is strong number");
        else
            System.out.println(number+ " is not strong number");
    }
    public int check_strong(int number)
    {
        int sum= 0,digit;
        while(number>0)
        {
            digit=number%10;
            sum=sum+getfac(digit);
            number=number/10;
        }
        return sum;
    }
    public int getfac(int num)
    {
        int fac=1,i;
        for(i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        return(fac);
    }
}