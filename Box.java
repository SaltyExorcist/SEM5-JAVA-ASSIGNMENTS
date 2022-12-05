import java.util.*;
public class Box {
    int length, breadth, height;

    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public int volume() {
        int vol = length * breadth * height;
        return vol;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l,b,h;
        System.out.print("Enter the length of the box:");
        l = sc.nextInt();
        System.out.print("Enter the breadth of the box:");
        b = sc.nextInt();
        System.out.print("Enter the height of the box:");
        h = sc.nextInt();
        Box obj = new Box(l, b, h);
        int vol=obj.volume();
        System.out.print("The volume of the box:"+vol);
    }
}
