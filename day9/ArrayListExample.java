package com.day9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {
	public static void main(String[] args)
	{
		//List<Integer> list = new ArrayList<>();    //To store only integer type value because the type is integer generic
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(30);
		list.add(10);  
		list.add(40);
		//list.add("Ajay");
		
		/*
		list.add(1, 15);		// adding element (index, value)
		System.out.println(list); //To display the list
		System.out.println(list.get(3));    //it is used to see index of element
		System.out.println(list.remove(0)); //it is used to remove element in that index
		System.out.println(list.contains(10)); // it tells the list having 10 or not(true or false)
		System.out.println(list.size()); //size of the list
		System.out.println(list.isEmpty()); //it tells the list is empty or not(true or false
		*/
		
		//way -1
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//Here Generic is object 
		//way -2
		for(Object i : list)
		{
			System.out.println(i);
		}
		
		//way - 3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("-----");
		//to print odd number
		Iterator<Integer> it2 = list.iterator();
		while(it2.hasNext())
		{
			Integer t = it2.next();
			if( t % 2 == 1)
			{
				it2.remove();
			}
		}
		System.out.println(list);	
		
		
	}
}