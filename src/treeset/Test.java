package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) 
	{
		TreeSet< String> t=new TreeSet<>(new mycomparator());
		t.add("mahesh");
		t.add("appala");
		t.add("babu");
		System.out.println(t);
		TreeSet <Integer> t1=new TreeSet<Integer>(new mycomp());
		t1.add(10);
		t1.add(16);
		t1.add(85);
		t1.add(35);
		System.out.println(t1);
		

	}

}
class mycomparator implements Comparator<String>
{

	
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
	}
class mycomp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2);
	}
	
}

