package Strings;

public class Substring {

	public static void main(String[] args) 
	{
		
		
		String m = "appalamaheshbabu";
	    String a = "appala";
	    char[] m1 = m.toCharArray();
	    char[] c = a.toCharArray();
	    System.out.println(isPresent(m1, c));
	}

	public static boolean isPresent(char[] apple, char[] webapple) {
	    for (int i = 0; i < webapple.length - apple.length+1; i++) {
	        for (int j = 0; j < apple.length; j++) {
	            if (webapple[i + j] == apple[j]) {
	                if (j == apple.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	

	}

}
