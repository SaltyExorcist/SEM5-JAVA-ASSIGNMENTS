import java.util.*;
public class Q15
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        char ch1,ch2;
        System.out.println("Enter the two Strings:");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        int l1=str1.length();
        int l2=str2.length();
        if(l1!=l2)
        {
            System.out.println("Cannot compare.");
        }
        else
        {
            int flag=0;
        for (int i = 0; i < l1; i++) {
            ch1 = str1.charAt(i);
            ch2 = str2.charAt(i);
            int x=str1.compareTo(str2);
            if(x>0)
            {
                flag=1;
                System.out.println("The first string is greater lexicographically.");
                break;
            }
            else if(x<0)
            {
                flag=1;
                System.out.println("The second string is greater lexicographically.");
                break;
            }
            else
            {
                System.out.println("Both strings are equal lexicographically.");
                break;
            }
           }
       }
    }
}
