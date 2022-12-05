import java.io.*;
public class Q17
{
    int c=0;
    void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        String s=br.readLine();
        System.out.println("The Anagrams are:");
        display("",s);
        System.out.println("Total no of Anagrams= "+c);
    }
    void display(String s1,String s2)
    {
        if(s2.length()<=1)
        {
            c++;
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0;i<s2.length();i++)
            {
                String x=s2.substring(i,i+1);
                String y=s2.substring(0,i);
                String z=s2.substring(i+1);
                display(s1+x,y+z);
            }
        }
    }
    public static void main(String args[])throws Exception
    {
        Q17 obj=new Q17();
        obj.input();
    }
}
/*
OUTPUT:
Enter a word
ride
The Anagrams are:
ride
ried
rdie
rdei
reid
redi
irde
ired
idre
ider
ierd
iedr
drie
drei
dire
dier
deri
deir
erid
erdi
eird
eidr
edri
edir
Total no of Anagrams= 24
*/




