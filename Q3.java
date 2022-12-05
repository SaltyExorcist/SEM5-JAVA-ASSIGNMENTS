import java.util.*;
import java.io.*;
public class Q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String text;
        char ch;
        System.out.println("Enter the String:");
        text=sc.nextLine();
        String s1=text.replaceAll("[aeiouAEIOU]","");
        System.out.println("The modified String is: "+s1);
    }
}
