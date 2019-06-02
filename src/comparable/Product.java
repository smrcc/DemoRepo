package comparable;

public class Product implements Comparable<Product>
{
	String name;
	int id;
	int cost;
	public Product(String name, int id, int cost) {
		this.name = name;
		this.id = id;
		this.cost = cost;
	}
	@Override
	public int compareTo(Product p) {
		
		if(id==p.id)
		return 0;
		else if(id>p.id)
			return 1;
		else
			return -1;
	}
	

}
