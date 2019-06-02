package wrapperclasses;

import java.util.Arrays;

public class s 
{
	public static void main(String args[])
	{
		
	
int num=123456;
int remainder;
int rev=0;
while(num!=0)
{
	remainder=num%10;
	num=num/10;
	rev=rev*10+remainder;
}System.out.println(rev);
	}
	
}		
	

