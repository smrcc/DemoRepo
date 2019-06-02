package wrapperclasses;

public class overriding 
{
	  void m1(int a)
	{
		System.out.println("parent class m1 method");
		System.out.println(a);
	}
	void m2(int a,int b)
	{
		System.out.println("parent class m2-method");
	}
}
class child extends overriding
{
	
void m1(int a)
{
	System.out.println("child class m1 method");
	System.out.println(a);
}
void m2(int a,int c)
{
	System.out.println("child class m2-method");
	System.out.println(a);
	System.out.println(c);
}
	public static void main(String[] args) 
	
	{
	 overriding o=new child();
	o.m1(10);
	o.m2(20, 30);

	}


}