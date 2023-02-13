import java.util.Scanner;
public class TestMyPoint
{
    public static void main(String args[])
    {
        MyPoint obj1=new MyPoint();
        Scanner sc=new Scanner(System.in);
        MyPoint obj2=new MyPoint();
        int a,b;
        System.out.println("Enter the coordinates:");
        a=sc.nextInt();
        b=sc.nextInt();
        obj1=new MyPoint(a,b);
        obj2.setXY();
        int arr1[]= obj1.getXY();
        int arr2[]= obj2.getXY();
        System.out.println("Coordinates of the 1st point:");
        String p1=obj1.conString();
        System.out.println(" "+p1);
        System.out.println("Coordinates of the 2nd point:");
        String p2=obj2.conString();
        System.out.println(" "+p2);
        double d1= obj1.Distance(obj2);
        System.out.println("Distance between the 1st and 2nd point:"+d1);
    }
}
