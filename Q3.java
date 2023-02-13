import java.util.*;
import java.io.*;
public class Q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String text,result="";
        char ch;
        System.out.println("Enter the String:");
        text=sc.nextLine();
        for(int i=0;i<text.length();i++)
        {
            ch=text.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                result=result+ch;
            else
                continue;
        }
        System.out.println("The modified String is: \n"+result);
    }
}
/*
Output:
Enter the String:
Hello, how are you?
The modified String is:
 Hll, hw r y?
 */
