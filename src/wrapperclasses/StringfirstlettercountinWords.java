package wrapperclasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringfirstlettercountinWords {

	public static void main(String[] args) 
	{
		String str="my name is mahesh babu";
		String s[]=str.split(" ");
		//Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{	
		
			System.out.println(s[i].charAt(0));
//			if(!s[i].isEmpty())	
//			{
//				System.out.println(s[i].charAt(0));
//			}
		
			
		
		}
		

	}

}
