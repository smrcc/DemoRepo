package wrapperclasses;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) 
	{
		String str="mahesh";
		String str1="hsemah";
		char[] c=str.toLowerCase().toCharArray();
		char[] c1=str1.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		//String ss=c.toString();
		//String ss1=c1.toString();
		if(Arrays.equals(c, c1))
		{
			System.out.println("given strings are anagrams");
		}else
		{
			System.out.println("gien strings are not anagrams ");
		}
		

	}

}
