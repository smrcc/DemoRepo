 package Strings;

import java.util.HashMap;
import java.util.Map;

public class Countwords {

	public static void main(String[] args) 
	{
		String str="i am learning learning selenium selenium java automation java am i";
		String arr[]=str.split(" ");
		Integer count=1;
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}else
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(String x:map.keySet())
		System.out.println("The count of word:"+x+"="+map.get(x));
		

	}

}
