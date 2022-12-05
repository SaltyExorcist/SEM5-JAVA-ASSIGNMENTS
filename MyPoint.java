import java.util.*;
public class MyPoint //Assignment 4
{
    int x,y;
    MyPoint()
    {
        x=0;
        y=0;
    }

    MyPoint(int a,int b)
    {
        x=a;
        y=b;
    }

    public void setXY() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
     int []getXY()
     {
         int a[]=new int[2];
         a[0]=x;
         a[1]=y;
         return a;
     }

     String conString()
     {
         String x="("+this.x+","+this.y+")";
         return x;
     }

     double Distance(MyPoint obj)
     {
         double h,d;
         h=Math.pow((this.x-obj.x),2)+Math.pow((this.x-obj.x),2);
         d=Math.sqrt(h);
         return d;
     }

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
