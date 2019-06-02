package set;

public class charincrement {

	public static void main(String[] args) 
	{
		String s="mahesh";
	char []	 c=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==' ')
		{
			continue;
		}
		else
		{
			int i1=(int)c[i];
			c[i]=(char) (i1+3);
		}
	}
		
String ss=new String(c);
System.out.println(ss);
	}

}
