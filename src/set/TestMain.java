package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class TestMain {

	public static void main(String[] args) 
	{
		Set<Emp> s=new LinkedHashSet<Emp>();
		s.add(new Emp("mahesh", 30));
		s.add(new Emp("babu", 31));
		s.add(new Emp("appala", 32));
		
		for(Emp e:s)
		{
			System.out.println(e.id+" "+e.name);
		}
		Iterator<Emp> itr=s.iterator();
		while(itr.hasNext())
		{
			Emp e=itr.next();
			System.out.println(e.id+" "+e.name);
		}
		

	}

}
