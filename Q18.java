import java.util.*;
public class Q18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String text;
        char ch;
        int count=1;
        System.out.println("Enter the String:");
        text=sc.nextLine();
        for(int i=0;i<text.length();i++)
        {
            ch=text.charAt(i);
            if(ch==' ')
                count++;
        }
        System.out.println("The no of words in the String are:"+count);
    }
}
