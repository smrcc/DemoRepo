package treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<>();
		for(int i=0;i<=10;i++)
		{
			t.add(i);
		}System.out.println(t);
		
		SortedSet<Integer> s=t.subSet(4, 9);
		System.out.println(s);
		
		SortedSet<Integer> s1=t.tailSet(5);
		System.out.println(s1);
		SortedSet<Integer> s3=	t.headSet(5);
		System.out.println(s3);
		

	}

}
