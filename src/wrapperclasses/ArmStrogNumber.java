package wrapperclasses;

public class ArmStrogNumber 
{
	public static void isarmstrongNumber(int num)
	{
		int cube=0;
		int r;
		int t =num;
		//t=num;
		while(num>0)
		{
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r); 
		}
		if(t==cube)
		{
			System.out.println("given number is armstrong number");
		}
		else
		{
			System.out.println("given number is not armstrong number");
		}
				
	}

	public static void main(String[] args) 
	{
		isarmstrongNumber(153);
		
		

	}

}
