package wrapperclasses;

import java.util.Arrays;
import java.util.Collections;

public class StringAnagrams {

	public static void main(String[] args) 
	{
		String str="mahesh";
		String str1="hsemah";
		char[]c1=str.toLowerCase().toCharArray();
		char[] c2=str1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("given strings are anagrams");
		}
		else
		{
			System.out.println("given strings are not anagarms");
		}
		

	}

}
