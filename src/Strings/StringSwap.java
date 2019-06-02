package Strings;

public class StringSwap {

	public static void main(String[] args) 
	{
	String a="mahesh";
	String b="babu";
	
	a=a+b;
	System.out.println(a);
	b=a.substring(0,a.length()-b.length());
	System.out.println(b);
	a=a.substring(b.length());
	System.out.println(a);

	}

}
