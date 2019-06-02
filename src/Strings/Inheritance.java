package Strings;

public class Inheritance {
void m1()
{
	System.out.println("parent class");
}
void m2()
{
	System.out.println("india");
}
	

	}
class child extends Inheritance
{
	void m3()
	{
		System.out.println("child class");
	}
	void m4()
	{
		System.out.println("andhra pradesh");
	}
	public static void main(String args[])
	{
		Inheritance i=new child();//by using parent reference we can't call child class methods
				i.m1();
				i.m2();
				Inheritance i1=(Inheritance) new child();
				i1.m1();
				i1.m2();
				
				child c=new child();
				c.m1();
				c.m2();
				c.m3();
				c.m4();
				
				
	}
}


