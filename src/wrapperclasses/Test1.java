package wrapperclasses;

public class Test1 {

	public static void main(String[] args) {
		
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		// converting wrapper object to primitive :: xxxvaule() all data types
		
	int i=	i1.intValue();
	double d=i2.doubleValue();
	
	System.out.println(i+d);
		
	
	//converting wrapper object into string
	
	String s=i1.toString();
	String s1=i2.toString();
	System.out.println(s+s1);
		
		

	}

}
