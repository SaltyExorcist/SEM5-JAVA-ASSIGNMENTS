import java.util.Arrays;
import java.util.Scanner;
public class Q13 {

    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        System.out.print("Array after deleting duplicates:");
        for (int i = 0; i < j; i++)
            System.out.print(arr[i] + " ");
        return j;
    }

    public static void main(String[] args) {
        int n, length;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        length = removeDuplicateElements(a, n);

    }
}