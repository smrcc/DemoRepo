package wrapperclasses;

public class Palindrome 
{
	public static void ispalindromeNumber(int num)
	{
		int r;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
 			sum=(sum*10)+r;
		}
		if(temp==sum)
		{
			System.out.println("given number is palindrome number");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
		
	}

	public static void main(String[] args) 
	{
		ispalindromeNumber(12121);
	
		

	}

}
