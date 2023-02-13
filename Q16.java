import java.util.Scanner;
public class Q16
{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str1,str2;
            int startIndex1,endIndex1,startIndex2,endIndex2;
            System.out.println("Enter the first string");
            str1=sc.nextLine();
            System.out.println("Enter the second string");
            str2=sc.nextLine();
            System.out.println("Enter the region of the first string");
            startIndex1=sc.nextInt();
            endIndex1=sc.nextInt();
            System.out.println("Enter the region of the second string");
            startIndex2=sc.nextInt();
            endIndex2=sc.nextInt();
            // Extract the region from the first string
            String region1 = str1.substring(startIndex1, endIndex1);
            // Extract the region from the second string
            String region2 = str2.substring(startIndex2, endIndex2);
            // Check if the regions are equal
            if (region1.equals(region2)) {
                System.out.println("The regions match!");
            } else {
                System.out.println("The regions do not match.");
            }
        }
}
/*
Output:
Enter the first string
Hello World
Enter the second string
Goodbye World
Enter the region of the first string
6
10
Enter the region of the second string
8
12
The regions match!
 */

