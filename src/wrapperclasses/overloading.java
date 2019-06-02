package wrapperclasses;

 public final  class overloading 
{

	 static void m1(int a)
	{
		System.out.println("m1 method");
		System.out.println(a);
	}
	  void m1(int a,int b)
	{
		System.out.println("m2 method");
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		new overloading().m1(10);
		new overloading().m1(20, 30);
		

	}

}
