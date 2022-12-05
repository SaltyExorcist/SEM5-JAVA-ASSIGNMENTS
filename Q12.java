import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        int i,j, n, x, pos;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to check to:");
        x = s.nextInt();
        System.out.println("pairs of elements in the array whose sum is equal to: "+x);
        for( i = 0; i <n; i++) {
            for (j = i; j < n; j++) {
                if(a[i]+a[j] == x && i!=j)
                    System.out.println("("+a[i]+","+a[j]+")");
            }
        }
    }
}