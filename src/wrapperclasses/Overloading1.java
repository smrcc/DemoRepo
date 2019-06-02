package wrapperclasses;

public class Overloading1 
{
	void m1(int b)
	{
		System.out.println("byte -args");
		
	}
void m1(byte s)
{
	System.out.println("short-args");
	
}
	public static void main(String[] args) 
	{
		new Overloading1().m1( 10);
		

	}

}
