package Strings;

public class StringWordcharCountFirstchar {

	public static void main(String[] args)
	{
		String str="my name is mahesh babu";
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			//System.out.println(str1[i].charAt(0));
			if(!str1[i].isEmpty())
			{
				System.out.println(str1[i].charAt(0));
			}
		}
		

	}

}
