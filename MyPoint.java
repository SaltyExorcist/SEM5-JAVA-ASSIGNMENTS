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
         h=Math.pow((this.x-obj.x),2)+Math.pow((this.y-obj.y),2);
         d=Math.sqrt(h);
         return d;
     }


}
/*
Output:
Enter the coordinates:
2
3
Enter the coordinates:
7
9
Coordinates of the 1st point:
 (2,3)
Coordinates of the 2nd point:
 (7,9)
Distance between the 1st and 2nd point:7.0710678118654755

 */