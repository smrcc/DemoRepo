package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonrepeatedCharacter {

	public static void main(String[] args) 
	{
		String str=" swiss";
		Map<Character,Integer> m=new LinkedHashMap<>();
		int count=1;     
		for(int i=0;i<str.length();i++)
		{
			if(!m.containsKey(str.charAt(i)))
			{
				m.put(str.charAt(i), count);
			}
			else 
			{
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
			}
		}
		//printing first non repeated character from map
		for(Entry<Character,Integer>entry:m.entrySet())
		{
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
				
			}
		}
	}

}
