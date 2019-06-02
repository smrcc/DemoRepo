package comparator;

import java.util.Comparator;

public class PnameComp implements Comparator<Product>
{

	@Override
	public int compare(Product P1, Product P2) {
		
		return -P1.name.compareTo(P2.name);//return return P2.name.compareTo(P1.name);
	}
	

}
