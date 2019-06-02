package comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestMainProduct {

	public static void main(String[] args) 
	{
		List<Product> l=new LinkedList<Product>();
		l.add(new Product("laptop", 35, 55000));
		l.add(new Product("bike", 18, 15000));
		l.add(new Product("scooter", 78, 35000));
		Collections.sort(l, new PidComp());
		for(Product e:l)
		{
			System.out.println(e.id+" "+e.cost+" "+e.name);
		}

	}

}
