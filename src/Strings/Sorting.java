package Strings;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		String sortedstring = "";
		char temp;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str = s.next();
//		s.close();
		String str="mahesh"; 
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i] < c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		for (int k = 0; k < c.length; k++) {
			sortedstring = sortedstring + c[k];
		}
		System.out.println("our sorted string is  " + sortedstring);

	}

}
