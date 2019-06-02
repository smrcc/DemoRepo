package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp1 {

	public static void main(String[] args) 
	{
		ArrayList<Emp1> al=new ArrayList<Emp1>();
		al.add(new Emp1("mahesh", 555));
		al.add(new Emp1("babu", 444));
		al.add(new Emp1("ckanth", 222));
		al.add(new Emp1("appala", 111));
		al.add(new Emp1("rajasekhar", 888));
		Collections.sort(al);
		for(Emp1 ee:al)
		{
			System.out.println(ee.id+" "+ee.ename);
		}
	//comparable limitations: 1 we are mixing sorting logics and business logics in single class
//2.one property sorting is possible to over come use comparator
	}

}
