package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) 
	{
		TreeSet<Product> t= new TreeSet<>(new mycomp2());
		t.add(new Product(1, "chair", 100));
		t.add(new Product(5, "fan", 1003));
		t.add(new Product(10, "cooler", 2100));
		for(Product p:t)
		{
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		

	}

}
class mycomp1 implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		
		return -p1.name.compareTo(p2.name);
	}
	
}
class mycomp2 implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) 
	{
		if(p1.id==p2.id)
		
		return 0;
		else if(-p1.id>p2.id)
			return 1;
		else
			return -1;
	}
	
}
