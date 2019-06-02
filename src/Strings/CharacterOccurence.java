package Strings;

public class CharacterOccurence {

	public static void main(String[] args) 
	{
		String str="programming";
		//String arr[]=str.split(" ");
	int r=	str.length()-str.replaceAll("m", "").length();
	System.out.println(r);
		

	}

}
