package wrapperclasses;

public class StrinEvenOddposition {

	public static void main(String[] args) 
	
	{
		String str="ABCDEFGHIJ";
		String s1="";
		String s2="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				s1=s1+str.charAt(i);
			}if(i%2==1)
			{
				s2=s2+str.charAt(i);
			}
		}
System.out.println("odd positions:"+ s1);
System.out.println("Even positions:"+ s2);
	}

}
