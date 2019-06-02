package comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestMainProduct {

	public static void main(String[] args) 
	{
		List<Product> l=new LinkedList<Product>();
		l.add(new Product("soap", 13, 35));
		l.add(new Product("book", 10, 45));
		l.add(new Product("pen", 5, 13));
		Collections.sort(l);
		for(Product e:l)
		{
			System.out.println(e.name+" "+e.id+" "+e.cost);
		}
	

	}

}
