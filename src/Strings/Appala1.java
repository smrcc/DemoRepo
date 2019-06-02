package Strings;

import java.util.Arrays;

public class Appala1 {

	public static void main(String[] args) {
		String s = "mahesh";
		String s1 = "hseham";
		char c[] = s.toLowerCase().toCharArray();
		char[] c1 = s1.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if (Arrays.equals(c, c1)) {
			System.out.println("given strings are anagrams");
		} else {
			System.out.println("given strings are not anagrams");
		}

	}

}
