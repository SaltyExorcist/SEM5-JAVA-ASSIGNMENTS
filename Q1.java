import java.util.*;
public class Q1
{
        public static void main(String args[])
        {
            int i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements:");
            for( i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            for(i=0;i<n/2;i++)
            {
                for(j=0;j<n/2-i-1;j++)
                {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for(i=n/2;i<n;i++)
            {
                for(j=n/2;j<n-i-1;j++)
                {
                    if (arr[j] < arr[j + 1]) {
                        int temp2 = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp2;
                    }
                }
            }
            System.out.println("The sorted array is: ");
            for (i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
    }

}
