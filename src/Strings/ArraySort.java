package Strings;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		char c[]= {'m','s','p','z','b','q','a'};
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println("before sorting chars " + c[i]);
			
			
		}
		Arrays.sort(c);
		
		System.out.println("after sorting chars");
		for(char cc:c)
		{
			System.out.println("sorting chars " + cc);
		}

	}

}
