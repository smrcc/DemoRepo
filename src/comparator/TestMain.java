package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {

	public static void main(String[] args) 
	{
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp("mahesh", 36));
		al.add(new Emp("appala",6));
		al.add(new Emp("babu", 60));
		Collections.sort(al, new EidComp());
		for(Emp e:al)
		{
			System.out.println(e.id+" "+e.ename);
		}
	

	}

}
