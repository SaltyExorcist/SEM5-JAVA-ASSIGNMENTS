import java.util.*;
public class Rows
{
    public static void main(String args[])
    {
        int i,j,min1,min2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int res1[]=new int[n];
        int res2[]=new int[n];
        System.out.println("Enter the elements in the matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<n;i++)
        {
            min1=a[i][0];
            min2=a[0][i];
            for(j=0;j<n;j++)
            {
                if(min1<a[i][j])
                    min1=a[i][j];

                if(min2<a[j][i])
                    min2=a[j][i];
            }
            res1[i]=min1;
            min1=0;
            res2[i]=min2;
            min2=0;
        }

        System.out.println("The min elements of each row are: ");
        for (i = 0; i < n; ++i)
            System.out.print(res1[i] + " ");

        System.out.println("\nThe min elements of each column are: ");
        for (i = 0; i < n; ++i)
            System.out.print(res2[i] + " ");
    }
}
/*
1 3 5
6 8 12
15 22 14

 */