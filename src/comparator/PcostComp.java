package comparator;

import java.util.Comparator;

public class PcostComp  implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.cost==p2.cost)
		return 0;
		else if(p1.cost>p2.cost)
			return 1;
		else
			return -1;
	}
	

}
