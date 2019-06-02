package wrapperclasses;

public class ccrms {

	public static void main(String[] args) 
	{
		String str="my self mahesh";
		String rev=" ";
		String rev1=" ";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			rev=arr[i];
			System.out.print(rev);
			for(int j=rev.length()-1;j>=0;j--)
			{
				rev1=rev1+rev.charAt(j);
			}
		}
		System.out.println(rev1);

	}

}
