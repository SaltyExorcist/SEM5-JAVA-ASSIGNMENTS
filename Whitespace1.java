import java.util.*;
public class Whitespace1
{
	public static void main(String args[])
		{
			String str="   Hey,  How are    you  ?";
			str=str.trim();
			str=str.replaceAll("\\s+"," ");
			System.out.println("String after removing whitespaces:"+str);
		}
}