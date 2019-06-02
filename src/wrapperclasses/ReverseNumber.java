package wrapperclasses;

public class ReverseNumber 
{
	public static void reverseNumber(int num)
	{
		  
		int reverse=0;
		int remainder;
		 
		 while(num!=0)
		 {
			 remainder=num%10;
			 num=num/10;
			 reverse=reverse*10+remainder;
		 }System.out.println(reverse);
		
	}
	

	public static void main(String[] args) 
	{
		reverseNumber(123456);
		
		

	}

}
