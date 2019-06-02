package wrapperclasses;

import Strings.mahesh;

public class Mahesh
{
	 void m1(int a,long b) 
	{
		System.out.println("m1 method");
	}
   void m1(long a,int  b)
{
	System.out.println("m2 method");
}
	public static void main(String[] args) 
	{
		
		
		Mahesh m=new Mahesh();
		//m.m1(10,20); ambiguity problem
		
		
		
		
		
	

	}

}
