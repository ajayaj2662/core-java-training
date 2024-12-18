package com.day9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample2 
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(30);
		list.add(10);  
		list.add(40);
		
		//System.out.println(list);
		
		//Traversing the collection
		//way-3 
		Iterator<Integer> it = list.iterator();
		while(it.hasNext());
		{
			Integer t = it.next();
			if( t%2==1)
			{
				it.remove();
			}
		
		}System.out.println(list);	
}
}
