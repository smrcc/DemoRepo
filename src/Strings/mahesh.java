package Strings;

public class mahesh {

	public static void main(String[] args) 
	{
		String str="my name is mahesh";
		String s[]=str.split(" ");
		String str1="";
		String str2="";
		for(int i=0;i<s.length;i++)
		{
			str1=s[i];
			System.out.println(str1);
			for(int j=str1.length()-1;j>=0;j--)
			{
				str2=str2 +str1.charAt(j);
				
			}
		}System.out.println(str2);
	

	}

}
