package Strings;

public class AAAAA {

	public static void main(String[] args) {
		try {
			System.out.println("na pere raju");
			int a=10/0;	
		}
catch(NullPointerException e)
		{
	System.out.println("null pointer exception");
		}catch(ArithmeticException e)
		{
		System.out.println("arithmetic exception");	
		} catch(Exception e)
		{
			System.out.println("parent exception");
		}
	}

}
