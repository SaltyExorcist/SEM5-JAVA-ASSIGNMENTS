import java.util.*;
public class Reverse
{
	public void reverse(String str)
		{
			String evword[]=str.split(" ");
			String revstring="";
			for(int i=0;i<evword.length;i++)
			{
				String word=evword[i];
				String revword="";
				for(int j=word.length()-1;j>=0;j--)
					{
						revword=revword+word.charAt(j);
					}
				revstring=revstring+revword+" ";
			}
			System.out.println("The reversed String is:"+revstring);
		}

	public static void main(String args[])
	{
		Reverse obj=new Reverse();
		obj.reverse("Say My Name");
	}
}