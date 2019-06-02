 package wrapperclasses;

import java.util.HashMap;
import java.util.Map;

public class M {

	public static void main(String[] args) 
	{
		String str="maheshbabu appala ongole india appala";
		String[] c=str.split(" ");
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(int i=0;i<c.length;i++)
		{
			//System.out.println(c[i]);
			if(!m.containsKey(c[i]))
			{
				m.put(c[i],1);
			}else
			{
				m.put(c[i], m.get(c[i])+1);
			}
		}//System.out.println(m);
		for(String cc:m.keySet())
		{
			System.out.println(cc+" "+m.get(cc));
		}


	}

}
