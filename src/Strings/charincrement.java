package Strings;

import java.util.Scanner;

public class charincrement {

	public static void main(String[] args) 
	{
//		Scanner s=new Scanner(System.in);
//		String str=s.nextLine();
//		System.out.println("Enter some characters: ");
		String str="java";
	char[] chars=	str.toCharArray();
	for(int i=0;i<chars.length;i++)
	{
		if(chars[i]==' ')
		{
			
			continue;
		}
		else
		{
			int i1=(int)chars[i];
			chars[i]=(char)(i1+3);
		}
	}
		String ss=new String(chars);
		System.out.println("new String is " + ss);

	}

}
