package wrapperclasses;

public class StringReverse {

	public static void main(String[] args) {
		String s="my name is mahesh";
		String s1[]=s.split(" ");
		String str="";
		String str1="";
		for(int i=0;i<s1.length;i++)
		{
			str=s1[i];
			System.out.println(str);
			for(int j=str.length()-1;j>=0;j--)
			{
				str1=str1+str.charAt(j);
			}
		}
		System.out.println(str1);
	}

}
