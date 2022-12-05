import java.util.*;
public class Sequence
{
    static int i,j;
    public static int sequenceCount(int arr[],int n)
    {
        int count=0;
       Arrays.sort(arr);
       for(i=1;i<n;i++)
       {
         if(arr[i]-arr[i-1]==1)
             count++;
         else
             continue;
       }
       return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Sequence obj=new Sequence();
        int c=obj.sequenceCount(a,n);
        System.out.println("The longest consecutive elements sequence is:"+c);
    }
}
