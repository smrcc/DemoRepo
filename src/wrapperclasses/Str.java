package wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Str {

	public static void main(String[] args)
	{
		String str="today weather is very hot";
		
		
		char[] arra = str.toCharArray();
		ArrayList<String> strr = new ArrayList<>();
		ArrayList<Character> st = new ArrayList<>();
		for(int i=0; i<arra.length ;i++)
		{
			//ArrayList<Character> st = new ArrayList<>();
			if(!Character.isWhitespace(arra[i]))
			{
				st.add(arra[i]);
			}
			else
			{
				Collections.reverse(st);
				strr.add(Arrays.toString(st.toArray()));
				st = new ArrayList<>();
			}
		}
		
		
		//String[] st=str.split("");
		
		for(int i=0; i<strr.size();i++)
		{
			System.out.println(strr.get(i));
		}
		
		/*String s="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+st[i]+"";
		}
		System.out.println(s);*/
	}

}
