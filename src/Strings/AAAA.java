package Strings;

public   class AAAA 
{
 void m1(int a)
{
	System.out.println("int a method");
}
 void m2()
 {
	 System.out.println("m2 method");
 }
}
class BBB extends AAAA
{
	void m1(int a)
	{
		System.out.println("overrided method");
	}

	public static void main(String[] args) 
	{
		AAAA a=new BBB();
		a.m1(10);
		a.m2();
	

	}

}
