 package Strings;

public class mm {

	public static void main(String[] args) 
	{
		String s="100A";
		String a[]=s.split("A");
		System.out.println(a[0]);
		int n=Integer.parseInt(a[0]);
		n=n+20;
		System.out.println(n);
		

	}

}
