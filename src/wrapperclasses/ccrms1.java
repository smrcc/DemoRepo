package wrapperclasses;

import java.util.HashSet;
import java.util.Set;

public class ccrms1 {

	public static void main(String[] args) 
	{
		String str="mahesh babu mahesh";
		String str1[]=str.split(" ");
		String r=" ";
		String r1=" ";
		//Set<String> s=new HashSet<String>();
		for(int i=0;i<str1.length;i++)
		{
			r=str1[i];
			System.out.print(r);
			for(int j=r.length()-1;j>=0;j--)
			{
				r1=r1+r.charAt(j);
			}
			
		}
		System.out.println(r1);
		
		}
		

	}


