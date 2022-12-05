import java.util.*;
public class Q2
{
    public static void main(String args[])
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int res1[] = new int[n];
        int res2[] = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int min1,min2;
        for (i=0;i<n;i++)
        {
            min1=arr[i][0];
            min2=arr[0][i];
            for (j=0;j<n;j++)
            {
                if (arr[i][j] < min1)
                {
                    min1=arr[i][j];
                }

                if (arr[j][i] < min2)
                {
                    min2=arr[j][i];
                }
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
