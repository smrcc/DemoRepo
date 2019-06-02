package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp("mahesh", 111));
		al.add(new Emp("babu", 444));
		al.add(new Emp("appala", 333));
		Collections.sort(al);
		for(Emp aa:al)
		{
			System.out.println(aa.ename+" "+aa.id);
		}

	}

}
