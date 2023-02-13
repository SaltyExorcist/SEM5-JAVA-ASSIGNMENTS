public class Frequency
{
	public static void main(String args[])
	{
		String str1 = "I am ninja";
		int[] f = new int[str1.length()];
		System.out.println(str1);
		for(int i = 0 ;i<str1.length(); i++)
		{
			f[i]=1;
			char s = str1.charAt(i);
			for(int j=i+1;j<str1.length();j++)
			{
				char s1 = str1.charAt(j);
				if(s == s1)
				{
					f[i]++;
					str1.replace(s1,'0');
				}
			}
			if(s != ' ' && s != '0')
			System.out.println(s+": "+f[i]);
		}
	}
}