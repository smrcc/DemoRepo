package Strings;

import java.util.HashMap;
import java.util.Map;

public class characteroccu {

	public static void main(String[] args) 
	{
		String str="maheshbabu";
		char[] s=str.toCharArray();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(m.containsKey(s[i]))
					{
				m.put(s[i], m.get(s[i])+1);
				
					}
			else
			{
				m.put(s[i], 1);
			}
		}
		System.out.println(m);

	}

}
